package day09_IfStatements;

import java.util.Scanner;

public class ZPrac2 {
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

        if (a==1){
            System.out.println("Para cekme ekranina hos geldiniz");
        }else if(b==1){
            System.out.println("Rapor ekranina hos geldiniz");
        }else if(c==1){
            System.out.println("Sefre degistirme ekranina hos geldiniz");
        }
    }
}
