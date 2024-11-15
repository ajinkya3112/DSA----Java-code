package com.ajinkya;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

//        switch (empID) {
//            case 1:
//                System.out.println("Ajinkya Kanade");
//                break;
//            case 2:
//                System.out.println("Harshad Maner");
//                break;
//            case 3:
//                System.out.println("Emp Number 3");
//                switch (department) {
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("No Department entered ");
//                }
//                break;
//            default:
//                System.out.println("Enter correct EmpID");
//                break;
//        }

        // Better way to write
        switch (empID) {
            case 1 -> System.out.println("Ajinkya Kanade");
            case 2 -> System.out.println("Harshad Maner");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department entered ");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }

    }
}
