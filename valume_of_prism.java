package ajinkya;

import java.util.Scanner;

public class valume_of_prism {
    public static void main(String[] args) {
        Scanner vp = new Scanner(System.in);
        char choice = 0;
        do {
            // prompt to enter the base and height of the prism
            System.out.println("Enter the base of the prism : ");
            double base = vp.nextDouble();
            System.out.println("Enter the height of the prism : ");
            double height =vp.nextDouble();

            // Calculate the volume of the prism
            double volume = base * height;

            //Display the result
            System.out.println("The volume of the prism is : " +volume);

            // ask the user if they want to calculate again?
            System.out.println("Do you want to calculate the volume of prism again (y/n)?");
            choice = vp.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program terminated.");
        vp.close();
    }
}
