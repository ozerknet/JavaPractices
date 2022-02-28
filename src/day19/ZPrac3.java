package day19;

import java.util.Scanner;

public class ZPrac3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number : ");
        int num1  = scan.nextInt();

        System.out.println("Enter a match operator (+,-): ");
        char operator = scan.next().charAt(0);

        if(!(operator == '+' || operator == '-')){
            System.err.println("Invlaid math operator. "  +operator);
            System.exit(0);
        }

        System.out.println("enter a number : ");
        int num2 = scan.nextInt();



    }
}
