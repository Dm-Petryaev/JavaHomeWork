package com.pb.PetryayevDm.HW8;

public class OnlineShop {
    public static void main (String[] args) {
        Auth LogOn  = new Auth();
        try {
            LogOn.signUp();
        } catch (WrongLoginException e1) {
            System.err.println("Неверный логин!");
        } catch (WrongPasswordException e2) {
            System.err.println("Неверный пароль!");
        }
        try {
            LogOn.signIn();
        } catch (WrongLoginException e3) {
            System.err.println("Неверный логин или пароль!");
        }
    }
}
