package com.pb.PetryayevDm.HW3;
import java.util.Scanner;
import java.util.Random;
public class Bingo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int x  = random.nextInt(101) ; // Случайное число
        // System.out.println(x);
        int y = 0; //Счетчик попыток
        int z; //Число, которое вводит игрок
        do {
            System.out.println("Ведите число от 0 до 100. Если хотите прекратить - введите 111");
            z = input.nextInt();
            y++;

                if (z==111) {System.out.println("Вы покидаете игру, желаем удачи");
                    break;}
                else if (z > x) {
                    System.out.println("Ваше число больше задуманного.Попробуйте еще раз");
                } else if (z < x) {
                    System.out.println("Ваше число меньше задуманного.Попробуйте еще раз ");
                }  else System.out.println("Вы угадали число " + x + " за " + y + " попыток");


                    } while (x!=z);

    }


}
