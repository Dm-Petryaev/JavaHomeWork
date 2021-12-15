package com.pb.PetryayevDm.HW11;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.util.*;
import java.time.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PhoneBook {
    private List<Person> phonebook = new ArrayList<>();

    public void Add() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите ФИО: ");
            String Nombre = scan.nextLine();
            System.out.println("Введите адрес: ");
            String Direccion = scan.nextLine();
            System.out.println("Введите номер телефона: ");
            String Telefono = scan.nextLine();
            System.out.println("Поочередно введите день, месяц и год рождения: ");
            int Dia = scan.nextInt();
            int Mes = scan.nextInt();
            int Ano = scan.nextInt();
            phonebook.add(new Person(Nombre, Direccion, Telefono, LocalDate.of(Ano, Mes, Dia), LocalDateTime.now()));
        } catch (Exception e) {
            System.err.println("Ошибка создания пользователя.");
        }
    }
    public String showPhoneBook() {
        return phonebook.toString();
    }
    // вывод
    public String Get(int i) {
        try {
            return phonebook.get(i).toString();
        } catch (IndexOutOfBoundsException e) {
            return "Ошибка вывода пользователя.";
        }
    }
    // удаление
    public void Remove() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Введите ФИО или номер для удаления контакта: ");
            String str = scan.nextLine();
            Person def = new Person(str, "default", str,
                    LocalDate.of(1970, 1, 1), LocalDateTime.now());
            for (int i = 0; i < phonebook.size(); i++) {
                if (phonebook.get(i).getNombre().equals(def.getNombre()) ||
                        phonebook.get(i).getTelefono().equals(def.getTelefono()))
                    phonebook.remove(i);
                System.out.println("Контакт успешно удалён!");
            }
        } catch (Exception e) {
            System.err.println("Ошибка удаления пользователя.");
        }
    }
    // поиск
    public String Search() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ФИО или номер для поиска: ");
        String str = scan.nextLine();
        // создаём дефолтный объект, куда вписываем str
        // и сравниваем значение str со списком пользователей
        Person def = new Person(str, "default", str,
                LocalDate.of(1970, 1, 1), LocalDateTime.now());
        for (int i = 0; i < phonebook.size(); i++) {
            if (phonebook.get(i).getNombre().equals(def.getNombre()) ||
                    phonebook.get(i).getTelefono().equals(def.getTelefono())) {
                return phonebook.get(i).toString();
            }
        }
        return "Пользователь не найден.";
    }
    // редактирование пользователя
    public void Modify() {
        try {
            // алгоритм аналогичен Search()
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите ФИО или номер пользователя для редактирования: ");
            String str = scan.nextLine();
            Person def = new Person(str, "default", str,
                    LocalDate.of(1970, 1, 1), LocalDateTime.now());
            for (int i = 0; i < phonebook.size(); i++) {
                if (phonebook.get(i).getNombre().equals(def.getNombre()) ||
                        phonebook.get(i).getTelefono().equals(def.getTelefono())) {
                    System.out.println("Пользователь найден.");
                    System.out.println(phonebook.get(i));
                    System.out.println("Для изменения ФИО введите 'name'");
                    System.out.println("Для изменения адреса введите 'address'");
                    System.out.println("Для изменения даты рождения введите 'date'");
                    System.out.println("Для изменения номера введите 'phone'");
                    String choice = scan.nextLine();
                    LocalDateTime changes = LocalDateTime.now();
                    switch (choice) {
                        case "name":
                            System.out.println("Введите новое ФИО: ");
                            String newName = scan.nextLine();
                            phonebook.get(i).setNombre(newName);
                            phonebook.get(i).setCambio(changes);
                            System.out.println("ФИО успешно изменено!");
                            break;
                        case "address":
                            System.out.println("Введите новый адрес: ");
                            String newAdress = scan.nextLine();
                            phonebook.get(i).setDireccion(newAdress);
                            phonebook.get(i).setCambio(changes);
                            System.out.println("Адрес успешно изменен!");
                            break;
                        case "phone":
                            System.out.println("Введите новый номер: ");
                            String newPhone = scan.nextLine();
                            phonebook.get(i).setTelefono(newPhone);
                            phonebook.get(i).setCambio(changes);
                            System.out.println("Номер успешно изменен!");
                            break;
                        case "date":
                            System.out.println("Введите поочередно день, месяц и год рождения: ");
                            int dd = scan.nextInt();
                            int mm = scan.nextInt();
                            int yy = scan.nextInt();
                            phonebook.get(i).setCumple(yy, mm, dd);
                            phonebook.get(i).setCambio(changes);
                            System.out.println("Дата рождения успешно изменена!");
                            break;
                        default:
                            System.out.println("Неверный запрос.");
                            break;
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Ошибка редактирования пользователя.");
        }
    }
    // вывод  по дате рождения
    public String SortByDateOfBirth() {

        Comparator<Person> cmp = Comparator.comparing(Person::getCumple);
        phonebook.sort(cmp);
        return phonebook.toString();
    }
    // вывод  по ФИО
    public String SortByName() {

        Comparator<Person> cmp = Comparator.comparing(Person::getCambio);
        phonebook.sort(cmp);
        return phonebook.toString();
    }
    // запись в файл всех данных
    public void toFile() {

        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            SimpleModule module = new SimpleModule();
            module.addSerializer(LocalDate.class, new LocalDateSerializer());
            module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
            module.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
            module.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
            mapper.registerModule(module);
            Path file = Files.createFile(Paths.get("phonebook.json"));
            String json = mapper.writeValueAsString(phonebook);
            try (BufferedWriter wr = Files.newBufferedWriter(file)) {
                wr.write(json);
            }
            System.out.println("Файл записан.");
        } catch (Exception e) {
            System.err.println("Ошибка записи в файл.");
        }
    }
    // чтение из файла
    public void fromFile() {
        // чтение файла
        try {
            File file = Paths.get("phonebook.json").toFile();
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            SimpleModule module = new SimpleModule();
            module.addSerializer(LocalDate.class, new LocalDateSerializer());
            module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
            module.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
            module.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
            mapper.registerModule(module);
            List<Person> persons = mapper.readValue(file, new TypeReference<List<Person>>() {});
            phonebook.addAll(persons);
            System.out.println("Файл прочитан.");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Ошибка чтения файла.");
        }
    }
}
