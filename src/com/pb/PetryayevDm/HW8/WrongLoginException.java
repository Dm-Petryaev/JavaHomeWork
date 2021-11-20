package com.pb.PetryayevDm.HW8;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Неверный пароль!");
    }
}

