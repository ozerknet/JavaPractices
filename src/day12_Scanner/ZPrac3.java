package day12_Scanner;

import java.util.Scanner;

public class ZPrac3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the circle ? ");

        double radiosCircle = scan.nextDouble();

        double area = radiosCircle * radiosCircle * radiosCircle * 3.14;
        double perimeter = 2 * radiosCircle * 3.14 ;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

        scan.close();
    }
}
