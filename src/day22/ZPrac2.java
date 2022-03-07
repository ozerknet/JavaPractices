package day22;

import java.util.Arrays;

public class ZPrac2 {
    public static void main(String[] args) {
        String sentence = "I love Java";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        String reverse = "";

        for (int i = words[1].length() - 1; i >= 0; i--) {
           reverse += words[1].charAt(i);

        }

        System.out.println(reverse);
    }
}
