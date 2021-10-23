package com.pb.PetryayevDm.HW3;

import java.util.Scanner;
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int[] array = new int[10];
//Наполняем массив
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите  любую цифру для " + i + " элемента массива");
            int operand1 = in.nextInt();
            array[i] = operand1;
        }
        //Выводим элементы массива
        for (int i = 0; i < 10; i++) {
            System.out.println("Элемент " + i + " массива равен " + array[i]);
        }
//Считаем сумму массива
        int z = 0;
        for (int i = 0; i < 10; i++) {
            z = z + array[i];

        }
        System.out.println("Сумма массива " + z);

        //Считаем кол-во положительных элементов
        int p = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] > 0) {
                p++;
            }

        }
        System.out.println("Количество положительных элементов массива " + p);

        //Сортируем по методу пузырьков

        boolean bubble = false;
        int n;
        while (!bubble) {
            bubble = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    n = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = n;
                    bubble = false;
                }
            }
        }
        //Выводим элементы массива
        System.out.println("Массив после сортировки: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Элемент " + i + " массива равен " + array[i]);
        }
    }
}