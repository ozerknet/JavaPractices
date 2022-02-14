package day14_Tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Could you enter a word, please? : ");

        String word = input.nextLine();
        System.out.println("word = " + word);

        String wordFirstChar = word.substring(0);
        //String wordWithoutFirsrChar= word.substring(0)
        System.out.println("wordFirstChar = " + wordFirstChar);

        String wordStart = "x";

        Boolean result = wordStart == wordFirstChar;

        if(result){
            System.out.println(word);
        }else {

        }


    }
}
/*

3. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code





*/