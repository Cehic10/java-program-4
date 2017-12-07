//******************************
//Name: Adrian Bernat
//Date: 12/06/17
//File Name: Driver.java
//Purpose:
//This file contains the definition and implementation of the Driver class. This stores the data
//for the driver and allows for easy encapsulation inside of templates.
//********************************************************************************************
package com.company;

public class Driver implements executable {
    //fields
    protected int distance_from_restaurant;
    protected String name_of_driver;

    //members
    Driver(){
        distance_from_restaurant = 0;
        name_of_driver = "";
    }

    Driver(int distance, String name){
        distance_from_restaurant = distance;
        name_of_driver = name;
    }

    public int get_data(){
        return distance_from_restaurant;
    }

    public String get_name(){
        return name_of_driver;
    }

    public void set_distance(int to_set){
        distance_from_restaurant = to_set;
    }

    public void set_name(String to_set){
        name_of_driver = to_set;
    }

    public void display(){
        System.out.print(name_of_driver + " (" + distance_from_restaurant + " miles away) ");
    }
}
