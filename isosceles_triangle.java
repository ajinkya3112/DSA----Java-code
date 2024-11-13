package ajinkya;

import java.util.Scanner;

public class isosceles_triangle {
    public static void main(String[] args) {
        Scanner ak = new Scanner(System.in);
        char choice = 0;

        do {
            // Prompt to enter the base and height
            System.out.println("Enter the base of the isosceles triangle : ");
            double base = ak.nextDouble();
            System.out.println(" Enter the height of the isosceles triangle : ");
            double height = ak.nextDouble();

            // calculate the area of isosceles triangle
            double area = (height * base) / 2;

            // Display the result
            System.out.println("The area of the isosceles triangle is : " + area);


            // ask the user if they want to calculate are again
            System.out.println("Do you want to calculate the area of isosceles triangle (y/n)? ");
            choice = ak.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program terminated");
        ak.close();
    }
}
