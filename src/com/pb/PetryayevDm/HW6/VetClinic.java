package com.pb.PetryayevDm.HW6;
import java.lang.reflect.Constructor;

public class VetClinic {
    public static void main(String[] args) throws Exception {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal horse = new Horse();

        Animal[] animals = {cat, dog, horse};
        Class clazzz = Class.forName("com.pb.PetryayevDm.HW6.Veterinarian");
        Constructor <Object> constructor  = clazzz.getConstructor(new Class[] {String.class});
        Object object = constructor.newInstance("Батюшинский Е.Н., БЕР");
        if (object instanceof Veterinarian) {
            for (Animal animal: animals) {
                System.out.printf("\nВетеринар принимает животное: ", animal.getName());
                Veterinarian.treatAnimal(animal);
            }
        }

        //for (Animal animal: animals) {
        //    System.out.println(animal.hashCode());
        //    System.out.println(animal.toString());


        //}


    }
}
