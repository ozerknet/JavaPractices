package day10_NestedIf;

import java.util.Scanner;

public class ZPrac1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int n3=scanner.nextInt();

        if (n1==n2 && n1==n3 && n2==n3 ){ //
            System.out.println("all equal");
        }else if (n1==n2 && n1!=n3 && n2!=n3 ){
            System.out.println("n1&n2 are equal");
        }else if (n1!=n2 && n1!=n3 && n2==n3 ){
            System.out.println("n2&n3 are equal");
        }else if (n1!=n2 && n1==n3 && n2!=n3 ){
            System.out.println("n3&n1 are equal");
        }else{System.out.println("none of them are equal");
        }
    }
}
