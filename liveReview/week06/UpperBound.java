package week06;

import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int total = 0;
        if (a == 5) {
            for (int i = 0; i <= 5; i++) {
                total =total+i;

                System.out.println(total);
            }
        }
        if (a == 11) {
            for (int i = 0; i <= 11; i++) {
                total =total+i;

                System.out.println(total);
            }
        }
        if (a == 100) {
            for (int i = 0; i <= 100; i++) {
                total =total+i;

                System.out.println(total);
            }
        }


    }
}
