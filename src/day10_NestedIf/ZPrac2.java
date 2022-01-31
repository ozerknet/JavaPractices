package day10_NestedIf;

import java.util.Scanner;

public class ZPrac2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter one number");
//        int n1 = scanner.nextInt();
//
//        // Nested if  - if without curly braces
//        // Nested if ---> Pre-condition
//
//        if (n1 > 0) {
//            System.out.println("Number is bigger than 0");
//        } else {
//            System.out.println("Number is smaller than 0");

        // PassOrFail
        int score = 400;
        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("Pass");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid score");

            System.out.println("-------------------------------------");

            int age = 25;
            boolean hasId = false;

            if(hasId){
                if (age>21){
                    System.out.println("Eligible");
                }else{
                    System.out.println("Not eligible");
                }


            }else{
                System.out.println("Customer does not have Id");
            }








        }
    }
}

