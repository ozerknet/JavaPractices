package Ozerk;

import java.util.Scanner;

public class Nums {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        //CODE HERE:

        boolean equal = num1 == num2;

        if (equal){
            System.out.println(num1 + " and " + num2 + " are equal");
        }

        boolean num1Greater = num1>num2;
        if (num1Greater){
            System.out.println(num1 + " is greater than " + num2);
        }

        boolean num2Greater = num2>num1;
        if (num2Greater){
            System.out.println(num2 + " is greater than " + num1);
        }
    }
}





/*
You have two numbers already declared and assigned values.

Check if num1 and num2 are equal, or not. Please follow the below examples and print message accordingly:

Enter 2 numbers:
10
10
​
10 and 10 are equal
Enter 2 numbers:
10
10

10 and 10 are equal
Enter 2 numbers:
100
55
​
100 is greater than 55
Enter 2 numbers:
100
55

100 is greater than 55
Enter 2 numbers:
33
333
​
333 is greater than 33





*/