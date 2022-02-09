package day14_Tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Could you enter 2 words please? : ");
        String first = input.next();
        String second = input.next();

        System.out.println(first + second);

        String f = first.substring(1);
        String s = second.substring(1);
        System.out.println("first word without 1st char = " + f);
        System.out.println("second word without 1st char = " + s);

    }
}

/*
1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana






*/