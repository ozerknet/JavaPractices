package day22;

import java.util.Arrays;

public class ZPrac6 {
    public static void main(String[] args) {

        int[][][][] arr4D = {{{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}}};



        for (int[][][] element : arr4D) {
            System.out.println(Arrays.deepToString(element));


        }
    }
}