package ajinkya;

import java.util.Scanner;

public class volume_of_pyramid {
    public static void main(String[] args) {
        Scanner vp = new Scanner(System.in);
        char choice = 0;
        do {
            // prompt to enter the base length, base width and height of pyramid
            System.out.println("Enter the base length of the pyramid : ");
            double length = vp.nextDouble();
            System.out.println("Enter the width of the pyramid :  ");
            double width = vp.nextDouble();
            System.out.println("Enter the height of the pyramid : ");
            double height = vp.nextDouble();

            // Calculate the volume of the pyramid
            double volume = (length * width * height) / 3;

            // display the result
            System.out.println("The volume of pyramid is  : " +volume );

            // Ask the user if they want to calculate the volume again
            System.out.println("Do you want to calculate volume of the pyramid again (y/n)?");
            choice = vp.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program terminated");
        vp.close();
    }
}
