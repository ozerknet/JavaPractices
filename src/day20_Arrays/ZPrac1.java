package day20_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class ZPrac1 {
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 2};
        int[] arr2 = {1, 2, 3};

        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        String[] students = {"Ozer", "Mike", "Cemil", "Davud", "Yusuf", "Kamil", "Kemal", "Alparslan"};

        String[] earlyBirds = Arrays.copyOf(students, 5);

        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        numbers = Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(numbers));

    }
}
