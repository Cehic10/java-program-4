package com.company;

public abstract class Food {
    //fields
    protected String name_of_dish;
    protected double price;

    //members
    Food(){
        name_of_dish = null;
        price = 0.0;
    }

    abstract void display();
    //abstract boolean compare();
    //abstract ????
}
