package day14_Tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Could you enter a word, please? : ");

        String word = input.nextLine();

        String wordEndly = word.substring(word.lastIndexOf("") - 2);
        System.out.println("wordEndly = " + wordEndly);
        String ly= "ly";
        boolean result = wordEndly == ly;
        System.out.println("result = " + result);
        if (result) {
            System.out.println("really???");
        } else {
            System.out.println("never mind");
        }


    }
}


/*

 2. ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"





*/