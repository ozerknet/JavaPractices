package Ozerk;

import java.util.Scanner;

public class PrintLastCharacter {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        int Uzunluk = word.length();



        System.out.println(word.charAt(Uzunluk-1));





    }
}


/*

Write a program that will print out last letter of the word (string).

Ex:

Input: java
Input: java
Output: a





*/