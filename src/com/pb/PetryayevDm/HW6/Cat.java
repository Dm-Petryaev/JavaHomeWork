package com.pb.PetryayevDm.HW6;
import java.util.Objects;
public class Cat extends Animal {
    public Cat() {
        super("Изаура", "Много кошачего корма", "Живет на кухне");
    }

    @Override
    public void eat() {
        System.out.println(" Изаура ест много кошачего корма на кухне");
    }
    @Override
    public void makeNoise() {
        System.out.println("Кошка говорит мяу - мяу");
    }
    @Override
    public String toString() {
        return "Cat{" + "Name=" + getName() + '\'' +
                ", Food=" + getFood() + '\'' +
                ", Location=" + getLocation() + '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFood(), getLocation());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return
                Objects.equals(getName(), cat.getName()) &&
                        Objects.equals(getFood(), cat.getFood())
                        && Objects.equals(getLocation(), cat.getLocation());
    }
}

