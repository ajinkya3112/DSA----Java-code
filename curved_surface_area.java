package ajinkya;

import java.util.Scanner;

public class curved_surface_area {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        char choice = 0;

        do {
            // Prompt to enter the radius and height of the cylinder
            System.out.println("Enter the radius of the cylinder : ");
            double radius = sa.nextDouble();
            System.out.println("Enter the height of the cylinder : ");
            double height = sa.nextDouble();

            //Calculate the curved surface area of the cylinder
            double area = 2 * Math.PI * radius * height;

            // Display the result
            System.out.println("The curved surface area of the cylinder :- " +area );

            // Ask the user if they want to calculate again
            System.out.println("Do you want to calculate the curved surface area of the cylinder again (y/n)?");
            choice = sa.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program terminated.");
        sa.close();
        }
}
