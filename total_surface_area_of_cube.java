package ajinkya;


import java.util.Scanner;

public class total_surface_area_of_cube {
    public static void main(String[] args) {
        Scanner tsa = new Scanner(System.in);
        char choice ;
        do {
            // prompt to enter the side of cube
            System.out.println("Enter the side of the cube : ");
            double side = tsa.nextDouble();

            // Calculate the total surface area of the cube
            double area = 6 * (side * side);

            //Display the result
            System.out.println("The total surface area of the cube is : " +area);

            //Ask the user if they want to calculate surface area again
            System.out.println("Do you want to calculate the total surface area again (y/n)?");
            choice = tsa.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program terminated");
        tsa.close();
    }
}
