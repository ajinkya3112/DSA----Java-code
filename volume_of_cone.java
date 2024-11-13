package ajinkya;

import java.util.Scanner;

public class volume_of_cone {
    public static void main(String[] args) {
        Scanner ap = new Scanner(System.in);
        char choice = 0;

        do {
            // prompt to asking user to get radius and height of the cove to calculate the volume of the cone
            System.out.println("Enter the radius of the cone : ");
            double radius = ap.nextDouble();
            System.out.println("Enter the height of the cone : ");
            double height = ap.nextDouble();

            // Calculate the volume of the cone use the radius and height of the cone
            double volume = 3/Math.PI *(radius * radius) * height ;

            // Display the result
            System.out.println("The cone height is " +height+"and cone radius is " +radius+"and this cone volume is " +volume);

            // Ask the user if they want to calculate volume again or not
            System.out.println("Do you want to volume of the cone again (y/n)? ");
            choice = ap.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program terminated");
        ap.close();

    }
}
