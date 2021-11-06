package com.pb.PetryayevDm.HW6;
import java.util.Objects;
public class Dog extends Animal {
    public Dog() {
        super ("Филя","Что дадут ","В будке ");
    }
    @Override
    public void eat() {
        System.out.println("Филя ест что дадут в своей будке");
    }
    @Override
    public void makeNoise() {
        System.out.println("Собака говорит гав- гав");
    }
    @Override
    public String toString() {
        return "Dog{" + "Name=" + getName() + '\'' +
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
        Dog dog = (Dog) o;
        return
                Objects.equals(getName(), dog.getName()) &&
                        Objects.equals(getFood(), dog.getFood())
                        && Objects.equals(getLocation(), dog.getLocation());
    }
}
