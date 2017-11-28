package com.company;

public class Entree extends Food{
    //data fields


    //members
    Entree(){
        name_of_dish = null;
        price = 0.0;
    }

    Entree(String name_to_set, double price_to_set){
        name_of_dish = name_to_set;
        price = price_to_set;
    }

    void display(){
        System.out.println("\nFood Type: Entree");//maybe use printf
        System.out.printf("Food name: %s\n", name_of_dish);
        System.out.printf("Price: %.2f\n", price);
    }
}

