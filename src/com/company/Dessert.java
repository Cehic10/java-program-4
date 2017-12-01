package com.company;

public class Dessert extends Food {
    //fields
    boolean served_cold;

    //members
    Dessert(){
        name_of_dish = null;
        price = 0.0;
        served_cold = false;
    }

    Dessert(String name_to_set, double price_to_set, boolean shared){
        name_of_dish = name_to_set;
        price = price_to_set;
        served_cold = shared;
    }

    void display(){
        System.out.println("\nFood Type: Dessert");//maybe use printf
        System.out.printf("Food name: %s\n", name_of_dish);
        System.out.printf("Price: %.2f\n", price);
        System.out.printf("Share Size: %b\n", served_cold);
    }
}
