package com.pb.PetryayevDm.HW4;
import java.util.Arrays;
import java.util.Scanner;

public class CapitalLetter {
    static void capitalize(String str) {
        char[] array = str.toCharArray();
        System.out.printf("\nВаш текст: %s", String.valueOf(str));
        char space = ' ';
        array[0] = Character.toUpperCase(array[0]);
        for (int i = 0; i<array.length; i++) {
            if (array[i] == space) {
                array[i+1] = Character.toUpperCase(array[i+1]);
            }
        }
        System.out.printf("\nОтформатированный текст: %s", String.valueOf(array));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String stroka1 = input.nextLine();
        capitalize(stroka1);
    }
}

