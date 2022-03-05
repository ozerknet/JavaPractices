package week08;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ZPrac6 {
    public static void main(String[] args) {

        int[] numbers = {12,34,555,667,3345,666,333,333,333,};

        int[] newnumbers = Arrays.copyOf(numbers,numbers.length);

        System.out.println(numbers);

    }
}
