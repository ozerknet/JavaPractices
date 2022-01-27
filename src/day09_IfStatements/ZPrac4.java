package day09_IfStatements;

import java.util.Scanner;

public class ZPrac4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your score please : ");
        int n = Integer.parseInt(scan.next());  // 1-7 ;

       if(n == 1){
            System.out.println("Today is Monday");
        }else if(n ==2){
            System.out.println("Today is Tuesday");
        }else if(n ==3){
            System.out.println("Today is Wednesday");
        }else if(n ==4){
            System.out.println("Today is Thursday");
        }else if(n ==5){
            System.out.println("Today is Friday");
        }else if(n ==6){
            System.out.println("Today is Saturday");
        }else if(n ==7){
            System.out.println("Today is Sunday");
        } System.out.println("Invalid");
    }
}
