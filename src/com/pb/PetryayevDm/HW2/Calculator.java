package com.pb.PetryayevDm.HW2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую цифру ");
        int operand1 = in.nextInt();
        System.out.println("Введите вторую цифру ");
        int operand2 = in.nextInt();
        System.out.println("Введите арифметический знак ");
        String sign = in.next();
        int result;
        switch (sign) {
            case "+":
                result = operand1 + operand2;
                System.out.println(result);
                break;
            case "-":
                result = operand1 - operand2;
                System.out.println(result);
                break;
            case "*":
                result = operand1 * operand2;
                System.out.println(result);
                break;
            case "/":
                if (operand2 == 0) System.out.println("Операция ДЕЛИТЬ НА 0 невозможна");
                else {
                    result = operand1 / operand2;
                    System.out.println(result);
                }
                break;
        }
    }
}
