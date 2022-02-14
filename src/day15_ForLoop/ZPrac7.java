package day15_ForLoop;

import java.util.Scanner;

public class ZPrac7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int max = -2147483648;
        int min = 2147483647;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number :");
            int num1 = scan.nextInt();

            int num2 = scan.nextInt();

            if (num1 > max) {
                max = num1;
            }
            if (num2 < min) {
                min = num2;
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }
}
