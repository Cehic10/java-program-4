package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        String name;
        int choice;
        Order ord = new Order();
        Scanner scan = new Scanner(System.in);
        Doubly_LL DLL = new Doubly_LL();

        System.out.println("This is going to be program #4 in CS202.");

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

        System.out.println("What is your name?");
        name = scan.nextLine();
        ord.set_orderer_name(name);

        String food_name;
        double price;

        System.out.println("Would food would you like to order? Insert a string: ");
        food_name = scan.nextLine();
        price = 4.95;
        Food ent = new Entree(food_name, price);
        ord.insert(ent);
        ord.display();




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
