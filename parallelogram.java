package ajinkya;

import java.util.Scanner;

public class parallelogram {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        char choice = 0;

        do{
            // Prompt to enter the base and height
            System.out.println("Enter the base of the parallelogram : ");
            double base = sa.nextDouble();
            System.out.println("Enter the height of the parallelogram : ");
            double height = sa.nextDouble();

            // Calculate the area of parallelogram
            double area = base * height;

            // Display the result
            System.out.println("The area of the parallelogram is : " + area );

            // Ask the user if they want to calculate parallelogram are again
            System.out.println("Do you want to calculate area of the parallelogram again (y/n)? " );
            choice = sa.next().charAt(0);

        } while (choice == 'y' || choice =='Y');

        System.out.println("Program terminated");
        sa.close();
    }
}
