package com.pb.PetryayevDm.HW7;

public class Skirt extends Clothes implements  WomenClothes {
    public Skirt() {
        super("Юбка", Size.S,"Красная",19.19);
    }
       @Override
    public void dressWomen(){
        System.out.println("Женщина одевает юбку.");

    }
}

