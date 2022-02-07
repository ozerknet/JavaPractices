package day12_Scanner;

import java.util.Scanner;

public class ZPrac5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Waht is your age?");
        int age = scan.nextInt();

        scan.nextLine(); // Enter

        System.out.println("Could you write your full name?");
        String fullName = scan.nextLine(); // Before enter active, nothing can entering



        System.out.println("Enter your GPA  :");
        double gpa = scan.nextDouble();

        scan.nextLine(); // Enter

        System.out.println("Enter your school name :");
        String schoolName = scan.nextLine();


        System.out.println("Age = " + age);
        System.out.println("Full Name = " + fullName);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);

        scan.close();

    }
}
