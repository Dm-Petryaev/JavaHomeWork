package com.pb.PetryayevDm.HW7;

public class Tie extends Clothes implements ManClothes{
    public Tie() {
        super("Галстук", Size.S,"Зеленый",78.78);
    }
    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает галстук.");
        }
}
