//******************************
//Name: Adrian Bernat
//Date: 11/28/17
//File Name: Food.java
//Purpose:
//This file contains the declaration and implementation of the Food class, which is an abstract base class
//that will have multiple food items underneath it.
//********************************************************************************************
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
}
