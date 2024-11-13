package ajinkya;

import java.util.Scanner;

public class triangle_perimeter {
    public static void main(String[] args) {
        Scanner tp = new Scanner(System.in);
        char choice = 0;

        do {
            // Prompt to enter the three sides of the triangle
            System.out.println("Enter the first side of the triangle : ");
            double side_1 = tp.nextDouble();
            System.out.println("Enter the second side of the triangle : ");
            double side_2 = tp.nextDouble();
            System.out.println("Enter the third side of the triangle : ");
            double side_3 = tp.nextDouble();

            // Calculate the perimeter of triangle
            double perimeter = side_1 + side_2 + side_3;

            // Display the result
            System.out.println("The perimeter of the triangle is  : " + perimeter );

            // Ask the user if they want to calculate perimeter again
            System.out.println("Do you want to calculate perimeter again (y/n)?");
            choice = tp.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program terminated");
        tp.close();
    }
}
