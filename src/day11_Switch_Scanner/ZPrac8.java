package day11_Switch_Scanner;

public class ZPrac8 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 5;
        int num3 = 10;

        if (num1 == num2) {
            if (num1 == num3) {
                System.out.println("All equal");
            } else System.out.println("num1 and num2 are equal");
        } else if (num2 == num3) {
            System.out.println("num2 and num3 are equal");
        } else if (num3 == num1) {
            System.out.println("num1 and num3 are equal");
        } else System.out.println("none of them are equal");
    }
}
