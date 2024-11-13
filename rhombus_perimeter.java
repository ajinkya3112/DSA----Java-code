package ajinkya;

import java.util.Scanner;

public class rhombus_perimeter {
    public static void main(String[] args) {
        Scanner rp = new Scanner(System.in);
        char choice =0;

        do {
            // Prompt to enter the sides of rhombus
            System.out.println("Enter the side of the rhombus : ");
            double side = rp.nextDouble();

            // Calculate the perimeter of rhombus
            double perimeter = side * 4;

            // Display the result
            System.out.println("The perimeter of the rhombus is " + side + " is : " + perimeter );

            // Ask the user if they want to calculate the perimeter again
            System.out.println("Do you want to calculate the perimeter again (y/n)?");
            choice = rp.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program terminated");
        rp.close();
    }
}
