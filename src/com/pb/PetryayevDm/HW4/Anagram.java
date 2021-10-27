package com.pb.PetryayevDm.HW4;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
    static void esAnagram (String str1, String str2 ){
        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();
        char[] Primero = str1.toCharArray();
        char[] Segundo = str2.toCharArray();
        //System.out.println( str1);
        //System.out.println( str2);

        //int x1,x2;
        //x1=Primero.length;
        //x2=Segundo.length;
        if (Primero.length==Segundo.length){
            Arrays.sort(Primero);
            Arrays.sort(Segundo);
            if (Arrays.equals(Primero,Segundo))
                System.out.println ("Это анаграмма");
            else System.out.println("Строки не являются анаграмами");
        }
        else
            System.out.println("Строки не являются анаграмами");
    }

public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ниже первое предложение");
        String x = input.nextLine();
        System.out.println("Введите ниже второе предложение");
        String y = input.nextLine();
        esAnagram(x, y);
}
}
