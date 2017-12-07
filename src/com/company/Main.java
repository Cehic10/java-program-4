//******************************
//Name: Adrian Bernat
//Date: 11/28/17
//File Name: Main.java
//Purpose:
//This file contains the declaration and implementation of the main class and function.
//This program is designed to serve as an application that receives information from the user
//and allows them to order food from the restaurant of their choosing.
//********************************************************************************************
package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //declaring variables
        final String RESTAURANT_FILE_NAME = "restaurants.txt";
        final String MENU_FILE_NAME = "menu";
        final int MAX_NUM_OF_RESTAURANTS = 3;
        final int MAX_NUM_OF_MENU_ITEMS = 3;
        String orderer_name;
        int choice;
        char answer;
        Scanner scan = new Scanner(System.in);
        Doubly_LL DLL = new Doubly_LL();
        Order ord = new Order();

        System.out.println("Welcome to JavaEats, the revolutionary new way to order your food!");

        do {
            int restaurants_inserted = 0;
            //get the name of the person
            System.out.println("What is your name?");
            orderer_name = scan.nextLine();
            scan.nextLine();
            ord.set_orderer_name(orderer_name);


            //********************
            //File reading for restaurant list
            Scanner rest = new Scanner(new File(RESTAURANT_FILE_NAME));
            rest.useDelimiter(",");

            String[] restaurants = new String[MAX_NUM_OF_RESTAURANTS];
            while (rest.hasNext()) {
                restaurants[restaurants_inserted] = rest.next();
                restaurants_inserted++;
            }

            System.out.printf("What restaurant would you like to order from? Please enter a number from 1-3: %s(1), %s(2), %s(3)", restaurants[0], restaurants[1], restaurants[2]);

            choice = scan.nextInt();
            scan.nextLine();
            //switch statement to handle the input
            switch (choice) {
                case 1:
                    ord.set_restaurant_name(restaurants[0]);
                    break;
                case 2:
                    ord.set_restaurant_name(restaurants[1]);
                    break;
                case 3:
                    ord.set_restaurant_name(restaurants[2]);
                    break;
                default:
                    System.out.println("Incorrect input.");
                    break;
            }

            //read from the menu file
            Scanner menu_file = new Scanner(new File(MENU_FILE_NAME + choice + ".txt"));
            menu_file.useDelimiter(",");

            String[] menu_items = new String[MAX_NUM_OF_MENU_ITEMS];
            double[] menu_prices = new double[MAX_NUM_OF_MENU_ITEMS];

            for (int index = 0; index < MAX_NUM_OF_MENU_ITEMS; index++) {
                menu_items[index] = menu_file.next();
            }

            for (int y = 0; y < MAX_NUM_OF_MENU_ITEMS; y++) {
                try {
                    menu_prices[y] = menu_file.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.print(e.getMessage());
                }
            }

            System.out.printf("\nWhat would you like to order from here? %s ($%.2f) (Option 1), %s ($%.2f) (Option 2), %s ($%.2f) (Option 3)", menu_items[0], menu_prices[0], menu_items[1], menu_prices[1], menu_items[2], menu_prices[2]);
            System.out.print("\nPlease choose an option: ");
            choice = scan.nextInt();
            Food food_to_order;

            switch (choice) {
                case 1:
                    food_to_order = new Entree(menu_items[0], menu_prices[0]);
                    ord.insert(food_to_order);
                    break;
                case 2:
                    food_to_order = new Entree(menu_items[1], menu_prices[1]);
                    ord.insert(food_to_order);
                    break;
                case 3:
                    food_to_order = new Entree(menu_items[2], menu_prices[2]);
                    ord.insert(food_to_order);
                    break;
                default:
                    System.out.println("Wrong Input");
                    break;
            }

            DLL.insert(ord);
            System.out.println("Would you like to make another order? (y/n)");
            scan.nextLine();
            answer = scan.next().charAt(0);
        } while (answer == 'Y' || answer == 'y');

        System.out.println("Your order details are: ");
        DLL.display();

        System.out.println("Finding nearest driver...");


        Balanced_Tree restaurant_tree = new Balanced_Tree<Driver>();
        restaurant_tree.insert(new Driver(15, "Alfred"));
        restaurant_tree.insert(new Driver(5, "George"));
        restaurant_tree.insert(new Driver(2, "Matt"));
        restaurant_tree.insert(new Driver(7, "Bob"));
        System.out.print("The closest driver is ");
        restaurant_tree.retrieve_lowest().get_data().display();
        System.out.print(" and he will be there shortly!\n");
        System.out.print("Thank you for your business! Come again!\n");
    }
}

