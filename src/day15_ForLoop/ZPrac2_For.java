package day15_ForLoop;

import java.util.Scanner;

public class ZPrac2_For {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want answer some question about your work? :");
        String Answer = input.nextLine();

        int ozerHoursWorkPerWeek;
        String ozerCompanName;
        String ozerCityCompany;


        if (Answer.equalsIgnoreCase("yes")) {

            for (int i = 1; i <= 3; i++) {
                System.out.println("What is your name ? :");
                String name = input.nextLine();
                if (name.equalsIgnoreCase("ozer")) {
                    System.out.println("How many hours working per week ? :");
                    ozerHoursWorkPerWeek = input.nextInt();
                    System.out.println("Which company do you work :");
                    input.next();
                    ozerCompanName = input.nextLine();
                    ozerCityCompany = input.nextLine();
                }
                if (name.equalsIgnoreCase("kamil")) {
                    System.out.println("How many hours working per week ? :");
                    int kamilHoursWorkPerWeek = input.nextInt();
                    System.out.println("Which company do you work :");
                    input.next();
                    String kamilCompanName = input.nextLine();
                    System.out.println("Which city are you working? :");
                    String kamilCityCompany = input.nextLine();
                }
                if (name.equalsIgnoreCase("ali")) {
                    System.out.println("How many hours working per week ? :");
                    int aliHoursWorkPerWeek = input.nextInt();
                    System.out.println("Which company do you work :");
                    input.next();
                    String aliCompanName = input.nextLine();
                    System.out.println("Which city are you working? :");
                    String aliCityCompany = input.nextLine();
                }

            }

        }

        System.out.println("Please chose user information : \n 1. Ozer \n 2. Kamil \n 3. Ali");
        int choose = input.nextInt();
        if (choose==1){
           // System.out.println("Ozer Information \n " + "ozerHoursWorkPerWeek : " +  ozerHoursWorkPerWeek + "\n ozerCompanName : " + ozerCompanName +  "\n ozerCityCompany : " + ozerCityCompany );
        }
        System.out.println("Thank you very much.");




    }
}
