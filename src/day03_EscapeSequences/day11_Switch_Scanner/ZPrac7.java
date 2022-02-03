package day03_EscapeSequences.day11_Switch_Scanner;

import java.util.Scanner;

public class ZPrac7 {
    // ATM screen choose
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please select option ");
        System.out.println(" 1.Take money out" +"\n 2.Put money in" +"\n 3.Change password"+"\n 4.Balance");
        int num = scan.nextInt();

        switch(num){
            case 1:
                System.out.println("Take money out");
                break;
            case 2:
                System.out.println("Put money in");
                break;
            case 3:
                System.out.println("Change password");
                break;
            case 4:
                System.out.println("Balance");
                break;
            default:
                System.out.println("Take your cards");
                break;
        }
    }

}
