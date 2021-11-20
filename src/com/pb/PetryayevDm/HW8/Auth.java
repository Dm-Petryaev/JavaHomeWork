package com.pb.PetryayevDm.HW8;
import java.util.*;
public class Auth {
    private String username;
    private String userpassword;
    private String confirmPassword;
    public String getUsername(){return username;};
    public String getUserpassword(){return userpassword;}
    public boolean LatinLetters (char LL ){return(LL>='a'&& LL<='z');}
    public void signUp() throws WrongLoginException,WrongPasswordException {
        Scanner scan = new Scanner (System.in);
        System.out.println("Придумайте логин, от 5 до 20 символов, латинские буквы и цифры ");
        System.out.println("Введите логин ");
        username = scan.nextLine();
        boolean check_username = false;
        char[] ab = getUsername().toLowerCase().toCharArray();
        if (ab.length>=5 &&ab.length<=20)
            for ( char LL: ab){
                if (LatinLetters(LL) || Character.isDigit(LL)) {
                    check_username = true;}
                    else throw new WrongLoginException ();
                    } else throw new WrongLoginException();
                // проверка пароля
        System.out.println("Придумайте пароль, от 5 до 20 латинских букв,цифры, знак _ ");
        System.out.println("Введите пароль ");
        userpassword = scan.nextLine();
        System.out.println("Повторите пароль ");
        confirmPassword = scan.nextLine();
        boolean check_password = false;
        char pw [] = getUserpassword().toLowerCase().toCharArray();
        if (confirmPassword.equals(getUserpassword())) {
            if (pw.length >=5 && pw.length <= 20)
                for (char c : pw) {
                    if (LatinLetters(c) || Character.isDigit(c) || c == '_')
                        check_password = true;
                    else throw new WrongPasswordException(userpassword);
                } else throw new WrongPasswordException(userpassword);
        } else throw new WrongPasswordException(userpassword);
    }
    public void signIn() throws  WrongLoginException {
        System.out.println("Войдите в интернет-магазин: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String LoginEnter = scan.nextLine();
        System.out.println("Введите пароль: ");
        String PasswordEnter = scan.nextLine();
        if(LoginEnter.equals(username) && PasswordEnter.equals(userpassword))
            System.out.println("Добро пожаловать!");
        else throw new WrongLoginException();
    }
}


