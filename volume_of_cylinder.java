package ajinkya;

import java.util.Scanner;

public class volume_of_cylinder {
    public static void main(String[] args) {
        Scanner vc = new Scanner(System.in);
        char choice = 0;

        do {
            // prompt to enter the radius and height
            System.out.println("Enter the radius of the cylinder : ");
            double radius = vc.nextDouble();
            System.out.println("Enter the height of the cylinder : ");
            double height = vc.nextDouble();

            // Calculate the volume of the cylinder
            double volume = Math.PI * (radius * radius) * height;

            // Display the result
            System.out.println("The volume of the cylinder is : " +volume);

            // Ask the user if they want to calculate the volume again
            System.out.println("Do you want to calculate the volume again (y/n)? ");
            choice = vc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program terminated. ");
        vc.close();
    }
}
