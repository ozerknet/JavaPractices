package day12_Scanner;

import java.util.Scanner;

public class ZPrac2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Could you write your number between 1-7 please? : ");

        int num = scan.nextInt();
        String result = "";
        if (num >= 1 && num <= 7) {
            //7
            System.out.println("Your number :" + num);

        } else {
            result = "Invalid number";
        }
    }
}
