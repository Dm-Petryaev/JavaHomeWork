package com.pb.PetryayevDm.HW9;
import java.util.*;
import java.io.IOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Filenumbers {
        public  static void createNumbersFile() throws IOException {
            Random random = new Random();
            Path path = Files.createFile(Paths.get(
                    "C:\\Users\\Пользователь\\IdeaProjects\\JavaHomeWork\\src\\com\\pb\\PetryayevDm\\HW9\\numbers.txt"
            ));

            int[] array = new int[100];
            for (int i = 0; i < array.length; i++)
                array[i] = random.nextInt(100);
            BufferedWriter bw = Files.newBufferedWriter(path);
            for (int i = 0; i < array.length; i++)
                if (i % 10 == 0 && i != 100 && i != 0) {
                    bw.write("\n" + array[i] + " ");
                } else
                    bw.write(array[i] + " ");
                bw.close();


    }
    public static void createOddNumbersFile() throws IOException {
        Path path = Paths.get(
                "C:\\Users\\Пользователь\\IdeaProjects\\JavaHomeWork\\src\\com\\pb\\PetryayevDm\\HW9\\numbers.txt"
        );
        Scanner s = new Scanner(path);
        int n = 0;
        while(s.hasNextInt()) {
            n++;
            s.nextInt();
        }
        int[] nums = new int[n];
        Scanner s1 = new Scanner(path);
        for(int i = 0; i < nums.length; i++) {
            nums[i] = s1.nextInt();
        }
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                nums[i] = 0;
        }
        s.close(); s1.close();
        // System.out.println(Arrays.toString(nums));
        Path newPath = Files.createFile(Paths.get(
                "C:\\Users\\Пользователь\\IdeaProjects\\JavaHomeWork\\src\\com\\pb\\PetryayevDm\\HW9\\odd_numbers.txt"
        ));
        BufferedWriter newbw = Files.newBufferedWriter(newPath);
        for  (int i = 0; i < nums.length; i++)
                 if (i % 10 == 0 && i != 100 && i != 0) {
                     newbw.write("\n" + nums[i] + " ");
                 } else
                     newbw.write(nums[i] + " ");
             newbw.close();
             System.out.println ("Файлы созданы успешно!");


    }

    public static void main (String args[]) {
            try {
                createNumbersFile();
                createOddNumbersFile();
            } catch (Exception e) {
                System.err.println("Внимание, ошибка в создании файла. " +
                        "Возможно, он существует, и его надо удалить перед запуском программы");

            }

    }

}
