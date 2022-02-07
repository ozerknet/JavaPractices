package day12_Scanner;

import java.util.Scanner;

public class ZPrac4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write your name : ");

        String fulName = scan.nextLine();

        System.out.println(fulName);

        String program = scan.next();
        System.out.println(program);
        scan.close();
    }
}
