package day22;

import java.util.Arrays;

public class ZPrac3 {
    public static void main(String[] args) {
// deepToString() method open arrays..

        // arr2D.forr shortcut for


        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12,13}};

//        for (int i = 0; i < arr2D.length; i++) {
//
//
//            for (int j = 0; j < arr2D[i].length; j++) {
//
//                System.out.println(arr2D[i][j]+" ");
//
//            }
//        }

        for (int i = arr2D.length - 1; i >= 0; i--) {

            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");

            }
            System.out.println();
        }

    }


}


