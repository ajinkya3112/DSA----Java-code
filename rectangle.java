package ajinkya;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner ma = new Scanner(System.in);
        char choice = 0;

        do {
            // Prompt to enter the length and width
            System.out.println("Enter the length of the rectangle : ");
            double length = ma.nextDouble();
            System.out.println("Enter the width of the rectangle : ");
            double width = ma.nextDouble();

            // calculate area fo rectangle
            double area = length * width;

            // Display  the result
            System.out.println("The area of the rectangle is : " + area);

            // ask the user to they calculate again
            System.out.println("Do you want to calculate are of rectangle again (y/n)?");
            choice = ma.next().charAt(0);
        }while (choice == 'y' || choice == 'Y');

        System.out.println("Program terminated");
        ma.close();
    }
}
