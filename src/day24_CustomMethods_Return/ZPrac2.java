package day24_CustomMethods_Return;

import java.util.Scanner;

public class ZPrac2 {
    public static void main(String[] args) {
        nameOfDay(1);

        nameOfMonth(12);

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your date like 01012021 ; ");
        int yourDate = scan.nextInt();

        System.out.println(yourDate);

    }


    public static void nameOfDay(int number) {
        if (number < 1 || number > 7) { // if the number is invalid
            System.out.println("Invalid");
            return; // exits nameOfDay method
        }
        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }

    }

    public static void nameOfMonth(int number) {  // 95
        if (number < 1 || number > 12) {
            System.out.println("Invalid");
            return; // exits nameOfMonth method, remaining code fragments of the method never gets executed
        }
        String name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May"
                : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct"
                : (number == 11) ? "Nov" : "Dec";
        System.out.println("Month name = " + name);

    }
}
