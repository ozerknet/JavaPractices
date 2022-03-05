package week08;

import java.util.Arrays;

public class ZPrac1 {
    public static void main(String[] args) {


        int code  = 200;

        int[] codes =  new int[8];
        System.out.println(Arrays.toString(codes));
        codes[0] = 100;
        codes[1] = 23;


        String out = Arrays.toString(codes);

        System.out.println(out);
//
        String[] words =  new String[8];
        String out1 = Arrays.toString(words);
        System.out.println(out1);



    }
}
