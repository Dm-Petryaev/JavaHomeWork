package com.pb.PetryayevDm.HW2;

import java.util.Scanner;

public class Interval {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println( "Введите любое число");
        int x;
        x =scan.nextInt();
        if  (x >0 && x<=14)
        System.out.println( "Вы ввели число от 0 до 14");
        else if (x>= 15 && x<=35)
        System.out.println( "Вы ввели число от 15 до 35");
        else if (x>= 35 && x<=50)
        System.out.println( "Вы ввели число от 36 до 50");
        else if (x>= 50 && x<=100)
        System.out.println( "Вы ввели число от 51 до 100");
        else if (x>100)
        System.out.println( "Вы ввели число БОЛЬШЕ 100");
        else if (x<0)
        System.out.println ("Вы ввели число МЕНЬШЕ 0" );

}}
