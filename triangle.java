package ajinkya;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        char choice = 0;

        do {
            //prompt to enter the value of height and base
            System.out.println("The enter the height of the triangle : ");
            double height = ab.nextDouble();
            System.out.println("The enter the base of the triangle : ");
            double base = ab.nextDouble();

            // calculate the area of triangle
            double area = 0.5 * height * base;

            // Display the result
            System.out.println("The are of the triangle is : " + area);

            // ask the user if they want to calculate again
            System.out.println("Do you want to the calculate the area of triangle again (y/n)? ");
            choice = ab.next().charAt(0);
        } while (choice == 'y' || choice =='Y');

        System.out.println("Program terminated");
        ab.close();
    }
}
