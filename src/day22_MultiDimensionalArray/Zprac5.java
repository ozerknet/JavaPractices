package day22;

import java.util.Arrays;

public class Zprac5 {

    public static void main(String[] args) {



    int[] arr1 = {1, 2, 3};
    int[] arr2 = {4, 5, 6};
    int[] arr3 = {7, 8, 9};

    int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


                    //     0          1           2             0       1        2
    int[][][] arr3D = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{4, 5, 6},{7,8,9},{10,11,12}}};
                           //      0                    1

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(arr3D[0][0][0]);


        for ( int[][] each2D: arr3D){
            for(int[] each1D: each2D){

                for (int element: each1D){
                    System.out.println(element);
                }
            }
        }

    }
}
