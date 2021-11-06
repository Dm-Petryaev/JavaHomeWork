package com.pb.PetryayevDm.HW6;

public class Animal {
    private String Name;
    private String Food;
    private String Location;

    public Animal(String Name, String Food, String Location)
    {  this.Name = Name;
       this.Food = Food;
       this.Location = Location;
     }

    public String getName() {return Name;}
    public String getFood() {return Food;}
    public String getLocation() {return Location;}

    public void eat()
    {System.out.println( "Животное кушает "+ Food);}
   public void makeNoise()
   {System.out.println( "Животное говорит " );}
   public void sleep ()
   {System.out.println( "Животное спит ");}
}

