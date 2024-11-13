package ajinkya;

import java.util.Scanner;

public class equillateral_triangle_p {
    public static void main(String[] args) {
        Scanner etp = new Scanner(System.in);
        char choice = 0;

        do {
            // Prompt to enter the side
            System.out.println("Enter the side of equilateral triangle : ");
            double side = etp.nextDouble();

            // Calculate the perimeter of equilateral triangle
            double perimeter = 3 * side;

            // Display the result
            System.out.println("The perimeter of the equilateral triangle is :  " + perimeter );

            // ask the user if they want to calculate perimeter again
            System.out.println("Do you want calculate perimeter again (y/n)?");
            choice = etp.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program terminated");
        etp.close();

    }
}
