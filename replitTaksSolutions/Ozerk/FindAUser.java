package Ozerk;

import java.util.Scanner;

public class FindAUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        String user1 = "Max Payne";
        String lUser1 = user1.toLowerCase();

        System.out.println("lUser1 = " + lUser1);

        String user2 = "Alan Wake";
        String lUser2 = user2.toLowerCase();

        System.out.println("lUser2 = " + lUser2);

        System.out.println("Enter full name:");
        String fullName = scan.nextLine();
        scan.close();
        String lFullName = fullName.toLowerCase();

        System.out.println("lFullName = " + lFullName);


        boolean result = (lFullName == lUser1);
        System.out.println("result = " + result);

    }
}
/*

Write a program that will look up a user.

Assume that you have only 2 users: Max Payne and Alan Wake. 
First, ask user to enter full name. 
Display message: "Enter full name:". Then take input from user. 
If name is equals to either "Max Payne" or "Alan Wake", display message: "User found!". 
Otherwise, display message: "User not found!". Please make your search case insensitive!

Example:

Display message: Enter full name:
Display message: Enter full name:
input: Max Payne
input: Max Payne
Display message: User found! 




//        String a="Ozer";
////        String b="ozer";
////        boolean res = a ==b;
//        System.out.println("res = " + res);



 String user1 = "Max Payne";
        String lUser1 = user1.toLowerCase();

        System.out.println("lUser1 = " + lUser1);

        String user2 = "Alan Wake";
        String lUser2 = user2.toLowerCase();

        System.out.println("lUser2 = " + lUser2);

        System.out.println("Enter full name:");
        String fullName = scan.next();
        scan.close();
        String lFullName = fullName.toLowerCase();

        System.out.println("lFullName = " + lFullName);


        boolean result = (lFullName == lUser1);
        System.out.println("result = " + result);
*/