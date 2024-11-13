package ajinkya;

import java.util.Scanner;

public class equilateral_triangle {
    public static void main(String[] args) {
        Scanner et = new Scanner(System.in);
        char choice = 0;

        do {
            // Prompt to enter the one side length for equilateral triangle
            System.out.println("Enter the side length of equilateral triangle : ");
            double side = et.nextDouble();

            // calculate the area of equilateral triangle
            double area = (Math.sqrt(3) / 4) * (side * side);

            //Display the result
            System.out.println("The area of the equilateral triangle is : " + area );

            // Ask the user if they want to calculate the area again
            System.out.println("Do you want to calculate the area of equilateral triangle again (y/n) ? ");
            choice = et.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program terminated");
        et.close();
    }
}
