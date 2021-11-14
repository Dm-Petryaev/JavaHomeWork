package com.pb.PetryayevDm.HW7;

public class Pants extends Clothes implements ManClothes, WomenClothes {
    public Pants() {
        super("Штанцы", Size.S,"Черный",25.25);
    }
    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает штаны.");
    }
    @Override
    public void dressWomen(){
        System.out.println("Женщина одевает штаны.");

    }

}
