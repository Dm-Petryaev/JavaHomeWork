package com.pb.PetryayevDm.HW7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes{
        public Tshirt() {
            super("Футболка", Size.S,"Белая",15.15);
        }
        @Override
        public void dressMan() {
            System.out.println("Мужчина надевает футболку.");
        }
        @Override
        public void dressWomen(){
            System.out.println("Женщина одевает футболку.");

        }

    }
