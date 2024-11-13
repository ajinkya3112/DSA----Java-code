package ajinkya;

import java.util.Scanner;

public class perimeter_circle {
    public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);
        char choice = 0;

        do {
            // Prompt to enter the radius of circle
            System.out.println("Enter the radius of the circle : ");
            double radius = pc.nextDouble();

            // Calculate the perimeter of circle
            double perimeter = 2 * (Math.PI * radius);

            // Display the result
            System.out.println("The perimeter of the circle is : " + perimeter);

            //Ask the user to calculate the perimeter of the circle
            System.out.println("Do you want to calculate the perimeter again (y/n)?");
            choice = pc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program terminated");
        pc.close();

    }

}
