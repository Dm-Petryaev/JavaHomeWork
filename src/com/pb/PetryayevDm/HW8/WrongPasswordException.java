package com.pb.PetryayevDm.HW8;

public class WrongPasswordException extends Exception{
    private String password;
    public WrongPasswordException (String password) {
        this.password = password;
    }
}
