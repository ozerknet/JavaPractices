package day24_CustomMethods_Return;

import java.util.Arrays;
import java.util.Scanner;

public class ZPrac9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {7,8,9};

        int[][] arr2D = { {1,2,3} , {4,5,6,7}, {8,9,10,11,12}  };

        int[][][] arr3D = {  {{1,2,3}, {4,5,6}, {7,8,9}} ,  {{10,20,30}, {40,50,60}, {70,80,90}}   };

        for (int[][] each2DArray : arr3D) {
            System.out.println("Arrays.toString(each2DArray) = " + Arrays.deepToString(each2DArray));
            
        }
    }
}

/*for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
            
 */