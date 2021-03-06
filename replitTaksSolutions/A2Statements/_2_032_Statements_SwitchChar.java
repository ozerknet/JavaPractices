package Cydeo.A2Statements;//Write a switch statement that tests the value of the char variable response and performs the following actions:
//        - if response is y, the message Your request is being processed is printed
//        - if response is n, the message Thank you anyway for your consideration is printed
//        - if response is h, the message Sorry, no help is currently available is printed
//        - for any other value of response, the message "Invalid entry, please try again!" is printed
//
//        Example:
//
//        ```
//        Display prompt: Enter command:
//        input: y
//        Display prompt: Your request is being processed
//        ```


import java.util.Scanner;

public class _2_032_Statements_SwitchChar {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = scan.next().charAt(0);
        //WRITE YOUR CODE HERE

        System.out.println("Would you want to exit ? Yes y or No n");
        String ans;
        ans = scan.nextLine();
        Boolean res = ans.equalsIgnoreCase("y");

       do {

           switch(response)
           {
               case 'y':
                   System.out.println("Your request is being processed");


               case 'n':
                   System.out.println("Thank you anyway for your consideration");


               case 'h':
                   System.out.println("Sorry, no help is currently available");


               default:
                   System.out.println("Invalid entry, please try again!");


           }



       }while (res);


    }
}
