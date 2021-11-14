package com.pb.PetryayevDm.HW7;

public enum Size {
    XXS, XS, S, M, L;
    private String Description;
    private int EuroSize;

    public String getDescription(Size size) {
        switch (size){
            case XXS: Description = "Детский размер";
            break;
            case XS: Description = "Взрослый размер";
            break;
            case S: Description = "Взрослый размер";
            break;
            case M: Description = "Взрослый размер";
            break;
            case L: Description = "Взрослый размер";
            break;
        } return Description;
    }
    public int getEuroSize(Size Razmer){
        switch (Razmer){
            case XXS: EuroSize = 32;
            break;
            case XS: EuroSize = 34;
            break;
            case S: EuroSize = 36;
            break;
            case M: EuroSize = 38;
            break;
            case L: EuroSize = 40;
            break;

        }return EuroSize;
    }
}
