package junkyard;

import java.util.Scanner;

public class cricle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        
        do {
            // Prompt the user to enter the radius
            System.out.println("Enter the radius of the circle:");
            double radius = sc.nextDouble();

            // Calculate the area of the circle
            double area = Math.PI * radius * radius;

            // Display the result
            System.out.println("The area of the circle with radius " + radius + " is: " + area);
            
            // Ask the user if they want to calculate again
            System.out.println("Do you want to calculate the area of the circle again (y/n)?");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program terminated.");
        sc.close();
    }
}
