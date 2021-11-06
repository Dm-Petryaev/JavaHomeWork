package com.pb.PetryayevDm.HW6;

import java.util.Objects;
public class Horse extends Animal {
    public Horse() {
        super("Буцефал ","Сено ","на конюшне ");
    }
    @Override
    public void eat() {
        System.out.println("Буцефал есть сено на конюшне ");
    }
    @Override
    public void makeNoise() {
        System.out.println("Лошадь говорит И-го-го");
    }
    @Override
    public String toString() {
        return "Horse{" + "Name=" + getName() + '\'' +
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
        Horse horse = (Horse) o;
        return
                Objects.equals(getName(), horse.getName()) &&
                        Objects.equals(getFood(), horse.getFood())
                        && Objects.equals(getLocation(), horse.getLocation());
    }
}
