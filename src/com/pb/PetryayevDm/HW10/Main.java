package com.pb.PetryayevDm.HW10;

public class Main {
    public static void main (String args[]) {
        NumBox<Integer> a = new NumBox<Integer>(5);
        try {
            a.add(15);
            a.add(22);
            a.add(34);
            a.add(41);
            a.add(51);
        } catch (Exception e) {
            System.out.printf("Массив переполнен,поэтому добавлено %s элемента.\n", a.length());
        }
        System.out.println("Размер массива " + a.length());
        System.out.println("Среднее значение массива " + a.average());
        System.out.println("Сумма массива " + a.sum());
        System.out.println("Максимальное значение " + a.max());

        NumBox<Float> b = new NumBox<Float>(5);
        try {
            b.add(15.11F);
            b.add(22.32F);
            b.add(34.43F);
            b.add(41.51F);
            b.add(51.71F);
        } catch (Exception e) {
            System.out.printf("Массив переполнен,поэтому добавлено %s элемента.\n", b.length());
        }
        System.out.println("Размер массива " + b.length());
        System.out.println("Среднее значение массива " + b.average());
        System.out.println("Сумма массива " + b.sum());
        System.out.println("Максимальное значение " + b.max());
    }

}
