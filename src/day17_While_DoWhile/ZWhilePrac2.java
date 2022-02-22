package day17_While_DoWhile;

import java.util.Scanner;

public class ZWhilePrac2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write Yes or No --> Do you married? ");
        String a = scan.nextLine();

        while( !( a.equals("yes")||a.equals("no") ) ){
            System.out.println("Invalid answer, please re-enter");
            a = scan.next().toLowerCase();
        }

        if(a.equals("yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Goodbye");
        }
    }
}
