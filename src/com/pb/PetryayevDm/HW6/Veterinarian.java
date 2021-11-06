package com.pb.PetryayevDm.HW6;

import java.util.Locale;

public class Veterinarian {
    private String Doctor;
    public Veterinarian(String Doctor) {
        this.Doctor = Doctor;
    }
    public String getDoctor() {
        return Doctor;
    }
    public static void treatAnimal(Animal animal) {
        System.out.println("\nКличка: " + animal.getName()
                + "\nЕда: "+ animal.getFood() + "\nМесто жительства: "
                + animal.getLocation().toLowerCase());


    }

}
