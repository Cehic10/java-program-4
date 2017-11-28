package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //declaring variables
        final String FILE_NAME = "details.txt";
        final int MAX_NUM_OF_RESTAURANTS = 5;
        int restaurants_inserted = 0;
        String orderer_name;
        int choice;
        Scanner scan = new Scanner(System.in);
        Doubly_LL DLL = new Doubly_LL();
        Order ord = new Order();
        //********************
        //File opening
        Scanner read = new Scanner(new File(FILE_NAME));
        read.useDelimiter(",");

        String [] restaurants = new String[MAX_NUM_OF_RESTAURANTS];
        while (read.hasNext()){
            restaurants[restaurants_inserted] = read.next();
            restaurants_inserted++;
        }



        //******************
        //Get restaurant name for order
        System.out.println("Would you like to order from McDonalds or Wendy's? (1) or (2):");
        choice = scan.nextInt();
        switch (choice){
            case 1:
                ord.set_restaurant_name("McDonalds");
                break;
            case 2:
                ord.set_restaurant_name("Wendy's");
                break;
            default:
                System.out.println("Incorrect input.");
                break;
        }

        //get the name of the person
        System.out.println("What is your name?");
        scan.nextLine();
        orderer_name = scan.nextLine();
        System.out.printf("Your name is %s", orderer_name);







        /*do {
            System.out.println("\nDLL Operations choice\n");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Display All");

            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter an int to insert: ");
                    DLL.insert(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Enter an int to remove: ");
                    DLL.remove(scan.nextInt());
                    break;
                case 3:
                    DLL.display();
                    break;
                case 4 :
                    DLL.remove_all();
                    DLL.display();
                    break;
                default:
                    System.out.println("ERROR: Wrong entry.\n");
                    break;
            }
            System.out.println("\nWould you like to go again? Y/N: ");
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');*/
    }
}
