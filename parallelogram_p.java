package ajinkya;

import java.util.Scanner;

public class parallelogram_p {
    public static void main(String[] args) {
        Scanner pp = new Scanner(System.in);
        char choice = 0;

        do {
            // Prompt to enter the base and side of parallelogram
            System.out.println("Enter the base of parallelogram : ");
            double base = pp.nextDouble();
            System.out.println("Enter the side of parallelogram : ");
            double side = pp.nextDouble();

            // Calculate the perimeter of parallelogram
            double perimeter = 2 * (base + side);

            // Display the result
            System.out.println("The perimeter of the parallelogram is : " + perimeter );

            // ask the user if they want to calculate perimeter of parallelogram again
            System.out.println("Do you want to calculate perimeter of parallelogram again (y/n)?");
            choice = pp.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program terminated");
        pp.close();
    }
}
