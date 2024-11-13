package ajinkya;

import java.util.Scanner;

public class perimeter_square {
    public static void main(String[] args) {
        Scanner ps = new Scanner(System.in);
        char choice = 0;

        do {
            // Prompt to enter the side of the square
            System.out.println("Enter the side of the square : ");
            double side = ps.nextDouble();

            // Calculate the perimeter of the square
            double perimeter = 4 * side;
            // Display the result
            System.out.println("The perimeter of the square is :  " + perimeter );
            // Ask the user if they want to calculate perimeter again
            System.out.println("Do you want to calculate the perimeter again (y/n)?");
            choice = ps.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("program terminated");
        ps.close();
    }
}
