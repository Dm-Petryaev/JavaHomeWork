package com.pb.PetryayevDm.HW5;

public class Reader {
    private String FIO;
    private int Bilet;
    private String Facultet;
    private String Birhtday;
    private String Telnumber;

    public Reader (String FIO, int Bilet, String Facultet, String Birthday, String Telnumber) {
        this.FIO = FIO;
        this.Bilet=Bilet;
        this.Facultet=Facultet;
        this.Birhtday=Birthday;
        this.Telnumber=Telnumber;
    }

    public void setFIO (String FIO) {this.FIO=FIO;}
    public void setBilet(int Bilet) {this.Bilet=Bilet;}
    public void setFacultet(String Facultet) {this.Facultet=Facultet;}
    public void setBirhtday(String Birthday) {this.Birhtday=Birthday;}
    public void setTelnumber (String Telnumber) {this.Telnumber=Telnumber;}

  public String getFIO() {return FIO;}
  public int getBilet() {return Bilet;}
  public String getFacultet() {return Facultet;}
  public String getBirhtday() {return Birhtday;}
  public String getTelnumber() {return Telnumber;}

    public String getReader() {return FIO+" "+Bilet+" "+Facultet+" "+Birhtday+" "+Telnumber;}

    public void takeBook() {
        System.out.println(getFIO() + " взял " + Book.getAmountBook() + " книги");
    }

    public void takeBook(String... Books)
    {System.out.print(getFIO() + " взял книги: ");
    for (String Book:Books){
    System.out.print(Book + ", ");}
    }

    public void takeBook(Book... books) {
        System.out.print(getFIO() + " взял книги: ");
        for (Book book : books) {
            System.out.print(book.getBookName() + " (" + book.getBookAuthor() + ", " + book.getYear() + ") ");
        }
    }

    public void returnBook() {
        System.out.println(getFIO() + " вернул " + Book.getAmountBook() + " книги");
    }

    public void returnBook(String... Books)
    {System.out.print(getFIO() + " вернул книги: ");
        for (String Book:Books){
            System.out.print(Book + ", ");}
    }

    public void returnBook(Book... books) {
        System.out.print(getFIO() + " вернул книги: ");
        for (Book book : books) {
            System.out.print(book.getBookName() + " (" + book.getBookAuthor() + ", " + book.getYear() + ") ");
        }
    }
}

