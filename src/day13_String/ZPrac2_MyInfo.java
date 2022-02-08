package day13_String;

import java.util.Scanner;

public class ZPrac2_MyInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        System.out.println("Enter your gender");
        String gender = scan.next();
        scan.nextLine();
        System.out.println("Enter your full name");
        String fullName = scan.nextLine();
        System.out.println("Enter your phone number");
        long phoneNumber = scan.nextLong();
        System.out.println("Enter your Zip Code");
        int zipCode = scan.nextInt();
        System.out.println("Enter your school name");
        scan.nextLine();
        String schoolName = scan.nextLine();
        System.out.println("Enter your city name");
        String cityName = scan.nextLine();
        System.out.println("Enter your state name");
        String stateName = scan.next();
        System.out.println("Enter your building number");
        int buildingNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your street name");
        String streetName = scan.nextLine();

        scan.close();

        System.out.println("Full name:" + fullName);
        System.out.println("Age :" + age);
        System.out.println("Gender : " + gender);
        System.out.println("Phone number :" + phoneNumber);
        System.out.println("Address: \n\t"+buildingNumber+" "+streetName+"\n\t" + cityName+", "+ stateName+" "+ zipCode);
        System.out.println("School name :" + schoolName);


    }

}
