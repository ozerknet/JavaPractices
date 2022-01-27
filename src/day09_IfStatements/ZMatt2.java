package day09_IfStatements;

import java.util.Scanner;

// Ctrl + / comment all selected line
public class ZMatt2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your score please : ");
        int score = Integer.parseInt(scan.next());

        boolean A = score >= 90;
        boolean B = score >= 80;
        boolean C = score >= 70;
        boolean D = score >= 60;

        if (A) {
            System.out.println("A");

        } else if (B) {
            System.out.println("B");

        } else if (C) {
            System.out.println("C");

        } else if (D) {
            System.out.println("D");

        } else {
            System.out.println("F");

        }


    }

}
