package day14_Tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Could you enter 2 words please? : ");
        String first = input.next();
        String second = input.next();

        String together = first + second;

        System.out.println(together);


        char firstLast = first.charAt(first.length() - 1);
        System.out.println("firstLast = " + firstLast);

        char secondFirst = second.charAt(0);
        System.out.println("secondFirst = " + secondFirst);

        Boolean result = firstLast == secondFirst;
        System.out.println("result = " + result);

        String lastWord = "";

        if (result) {
            System.out.println("Hello");
        }

    }
}


/*
4. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight







*/