package ajinkya;

import java.util.Scanner;
public class rhombus {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        char choice =0;

        do {
            //Prompt to enter the first and second diagonal
            System.out.println("Enter the first diagonal of the rhombus : ");
            double diagonal_1 = tr.nextDouble();
            System.out.println("Enter the second diagonal of the rhombus : ");
            double diagonal_2 = tr.nextDouble();

            // Calculate the area of rhombus
            double area = (diagonal_1 * diagonal_2) / 2;

            // Display the result
            System.out.println("The are of the rhombus is :  "  + area );

            // Ask the user if they want to calculate are of rhombus again
            System.out.println("Do you want to calculate area of rhombus again (y/n) ? ");
            choice = tr.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program terminated");
        tr.close();
    }
}
