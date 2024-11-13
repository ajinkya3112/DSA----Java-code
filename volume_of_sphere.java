package ajinkya;

import java.util.Scanner;

public class volume_of_sphere {
    public static void main(String[] args) {
        Scanner vs = new Scanner(System.in);
        char choice = 0;
    do {
        // prompt to enter the radius of the sphere
        System.out.println("Enter the radius of the sphere : ");
        double radius = vs.nextDouble();

        // Calculate the volume of the sphere
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // Display the result
        System.out.println("The volume of the sphere is  :  " +volume );

        // Ask the user if they want to calculate the volume again
        System.out.println("Do you want to calculate the volume of sphere again (y/n)? ");
        choice = vs.next().charAt(0);


        } while (choice == 'y' || choice == 'Y' );

        System.out.println("Program terminated");
        vs.close();

    }
}

