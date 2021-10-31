package com.pb.PetryayevDm.HW5;

import javax.imageio.spi.ImageReaderSpi;

public class Library {
    public static void main (String[] args){
        Book[] Books=new Book[3];
        Books[0] = new Book("Три мушкетера","А.Дюма",1984);
        Books[1] = new Book("Граф Монте Кристо","А.Дюма",1993);
        Books[2]= new Book("Экономика","П.Самуельсон",1996);

        for (int i=0;i< Books.length;i++)
        {System.out.println(Books[i].getBook());}

        Reader[] Readers= new Reader[3];
        Readers[0] = new Reader("Топольский А.А.",1976,"Музыкальный","20.10.1976","0689000000");
        Readers[1] = new Reader("Суворов А.Н",1984,"Исторический","06.04.1981","0675000000");
        Readers[2] = new Reader("Быков А.В,",1972,"Военный","16.01.1972","0500000000");

        for (int y=0;y<Readers.length;y++)
        {System.out.println(Readers[y].getReader());}

        Readers[0].takeBook();
        Readers[1].takeBook("Экономика", "Три мушкетера","Граф Монте Кристо");
        System.out.println();
        Readers[2].takeBook(Books[1], Books[2], Books[0]);
        System.out.println();
        Readers[0].returnBook();
        Readers[1].returnBook("Экономика", "Три мушкетера","граф Монте Кристо");
        System.out.println();
        Readers[2].returnBook(Books[1], Books[2], Books[0]);
    }
}
