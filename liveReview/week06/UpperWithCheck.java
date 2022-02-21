package week06;

import java.util.Scanner;

public class UpperWithCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int upperBond = scan.nextInt();
        int sum = 0;

        boolean check = true;

        for (; check; ) {
            if (upperBond >= 1) {
                for (int i = 1; i <= upperBond; i++) {
                    sum += i;

                }
                check = false;

            } else {
                System.out.println("Please Enter a Valid Number again : ");
                upperBond = scan.nextInt();
                check = true;
            }
        }
        System.out.println("sum = " + sum);
    }
}
