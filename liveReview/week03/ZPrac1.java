package week03;

import java.util.Scanner;

public class ZPrac1{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);// create scanner object
        int a;
        a = scan.nextInt();

        System.out.println("a = " + a);

//        int a = 0;

        boolean result = a%2 == 0 || a==0 ;

        if (result){
            System.out.println("a integer is even");
        }else{
            System.out.println("a integer is even");
        }
    }
}
