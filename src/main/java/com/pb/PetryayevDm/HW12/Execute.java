package com.pb.PetryayevDm.HW12;

import com.pb.PetryayevDm.HW11.PhoneBook;

import java.io.IOException;
import java.util.*;



public class Execute {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scan = new Scanner(System.in);
        System.out.println("Список команд для действий в справочнике");
        System.out.println("Введите 'search' для поиска");
        System.out.println("Введите 'add' для добавления контакта");
        System.out.println("Введите 'remove' для удаления контакта");
        System.out.println("Введите 'show' для отображения списка контактов");
        System.out.println("Сортировки по ФИО  - введите 'names'");
        System.out.println("Сортировке по дате рождения  - введите 'dates'");
        System.out.println("Редактирования пользователя  - введите 'modify");
        System.out.println("Вывод книги в JSON введите 'output'");
        System.out.println("Запись в книгу из JSON введите 'input'");
        System.out.println("Выхода  -  'quit'");
        String input = scan.nextLine();
        boolean run = true;
        while (run) {
            switch (input) {
                case "add":
                    phoneBook.Add();
                    System.out.println("Введите  запрос: ");
                    input = scan.nextLine();
                    break;
                case "search":
                    System.out.println(phoneBook.Search());
                    System.out.println("Введите  запрос: ");
                    input = scan.nextLine();
                    break;
                case "remove":
                    phoneBook.Remove();
                    System.out.println("Введите  запрос: ");
                    input = scan.nextLine();
                    break;
                case "modify":
                    phoneBook.Modify();
                    System.out.println("Введите  запрос: ");
                    input = scan.nextLine();
                    break;
                case "show":
                    System.out.println(phoneBook.showPhoneBook());
                    System.out.println("Введите  запрос: ");
                    input = scan.nextLine();
                    break;
                case "nameshow":
                    System.out.println(phoneBook.SortByName());
                    System.out.println("Введите  запрос: ");
                    input = scan.nextLine();
                    break;
                case "dateshow":
                    System.out.println(phoneBook.SortByDateOfBirth());
                    System.out.println("Введите  запрос: ");
                    input = scan.nextLine();
                    break;
                case "output":
                    phoneBook.toFile();
                    System.out.println("Введите  запрос: ");
                    input = scan.nextLine();
                    break;
                case "input":
                    phoneBook.fromFile();
                    input = scan.nextLine();
                    break;
                case "quit":
                    run = false;
                    System.out.println("Работа завершена");
                    break;
                default:
                    System.out.println("Неверный запрос. Попробуйте еще раз!");
                    input = scan.nextLine();
                    break;
            }
        }
    }
}
