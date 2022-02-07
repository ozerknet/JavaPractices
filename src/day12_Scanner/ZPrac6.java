package day12_Scanner;

import java.util.Scanner;

public class ZPrac6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your full name :");
        String fullName = scan.next();
        System.out.println("What is your building number :");
        int buildingNumber;
        buildingNumber = scan.nextInt();
        System.out.println("What is your street name ? :");
        String streetName = scan.next();
        System.out.println("What is your city name ? :");
        String cityName = scan.next();
        System.out.println("What is your state name ? :");
        String state = scan.next();
        System.out.println("What is your zipcode ? :");
        int zipCode = scan.nextInt();

        System.out.println("-------------------------------------" + "\n" + fullName + "\n" + buildingNumber + "\n"
                + streetName + "\n" + cityName + "\n" + state + "\n"
                + zipCode);
    }
}
