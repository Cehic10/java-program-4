package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Doubly_LL DLL = new Doubly_LL();
        System.out.println("This is going to be program #4 in CS202.");
        System.out.println("Testing the DLL.");
        char ch;
        int choice;

        do {
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
        } while (ch == 'Y' || ch == 'y');
    }
}
