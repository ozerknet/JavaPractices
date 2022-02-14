package day15_ForLoop;

import java.util.Scanner;

public class ZPrac1_ForLoop {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        int birtdayParty = 0;

        for (int i = 5; i <= 20; i += 5) {
            System.out.println("Happy birthday for " + i + " years old.");

            System.out.println("Did you make birthday party ? yes/no");
            String Ans1 = input.nextLine();
            if (Ans1.equalsIgnoreCase("yes")){
                birtdayParty +=1 ;
            }

        }
        System.out.println("Total Party, you did it : " + birtdayParty);

    }
}
