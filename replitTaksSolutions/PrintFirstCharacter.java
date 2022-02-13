import java.util.Scanner;

public class PrintFirstCharacter {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE:

        char firstChar = word.charAt(0);
        System.out.println(firstChar);



    }
}

/*
Write a program that will print out the first character of the word.

Ex:

Input: jump
Input: jump
Output: j
*
* */