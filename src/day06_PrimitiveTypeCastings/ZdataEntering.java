package day06_PrimitiveTypeCastings;

import java.util.Scanner;

public class ZdataEntering {
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? : ");
        name = input.next();

        System.out.println("Your name is = " + name);
    }
}
