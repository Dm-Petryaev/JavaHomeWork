package com.pb.PetryayevDm.HW5;

public class Book {
    private static int AmountBooks=0;
    public static int getAmountBook(){
        return AmountBooks;
    }
    private String BookName;
    private String BookAuthor;
    private int Year;

    public Book (String BookName, String BookAuthor,int Year) {
        this.BookName=BookName;
        this.BookAuthor=BookAuthor;
        this.Year=Year;
        AmountBooks++;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }
    public void setBookAuthor(String BookAuthor) {
        BookAuthor = BookAuthor;
    }
    public void setYear(int Year) {
        Year=Year;
    }

    public String getBookName() {
        return BookName;
    }
    public String getBookAuthor() {
        return BookAuthor;
    }
    public int getYear() {
        return Year;
    }
    public String getBook() {
        return "[Название книги: " + BookName + ", Автор: " + BookAuthor + ", год издания: " + Year + "]";
    }
}


