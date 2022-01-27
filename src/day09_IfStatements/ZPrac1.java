package day09_IfStatements;

import java.util.Scanner;

public class ZPrac1 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        a = Integer.parseInt(scan.next());

        System.out.println("enter b number");
        b = Integer.parseInt(scan.next());

        System.out.println("enter c number");
        c = Integer.parseInt(scan.next());

        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);

        boolean bIsMedian = (b > c && b < a) || (b > a && b < c);

        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian) {
            System.out.println(" a Median number");
        }else if(bIsMedian){
            System.out.println(" b Median number");
        }else {
            System.out.println(" c Median number");
        }

    }
}
