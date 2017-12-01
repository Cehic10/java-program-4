package com.company;

public class Appetizer extends Food {
    //fields
    boolean to_share;

    //members
    Appetizer(){
        name_of_dish = null;
        price = 0.0;
        to_share = false;
    }

    Appetizer(String name_to_set, double price_to_set, boolean shared){
        name_of_dish = name_to_set;
        price = price_to_set;
        to_share = shared;
    }

    void display(){
        System.out.println("\nFood Type: Appetizer");//maybe use printf
        System.out.printf("Food name: %s\n", name_of_dish);
        System.out.printf("Price: %.2f\n", price);
        System.out.printf("Share Size: %b\n", to_share);
    }
}
