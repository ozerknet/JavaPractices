package week03;

import java.util.Scanner;

public class ZPrac2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// create scanner object
        int ozerNot;
        System.out.println("Ozerin notunu giriniz : ");
        ozerNot = scan.nextInt();
        System.out.println("ozerNot = " + ozerNot);

        boolean A = ozerNot >=90;
        boolean B = ozerNot >=80;
        boolean C = ozerNot >=70;
        if (A){
            System.out.println("A");
        }else if (B){
            System.out.println("B");
        }else if (C){
            System.out.println("C");
        }else {
            System.out.println("Invalid");
        }


    }
}
