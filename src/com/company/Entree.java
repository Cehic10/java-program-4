package com.company;

public class Entree extends Food{
    //data fields


    //members
    Entree(){
        name_of_dish = null;
        price = 0.0;
    }

    Entree(String name_to_set, float price_to_set){
        name_of_dish = name_to_set;
        price = price_to_set;
    }

    void display(){
        System.out.println("Food Type: Entree");//maybe use printf
        System.out.println("Food name:"); //name_of_dish
    }
}

