package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ZPrac1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,800,900,1000));

        numbers.retainAll(Arrays.asList(100,200,300));

        System.out.println(numbers);



    }
}
