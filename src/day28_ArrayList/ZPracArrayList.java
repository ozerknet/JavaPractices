package day28_ArrayList;

import java.util.ArrayList;

public class ZPracArrayList {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};

        ArrayList<Integer> ozer = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        System.out.println("ozer = " + ozer);

        ozer.add(10);
        ozer.add(15);
        ozer.add(20);
        ozer.add(0, 19);
        ozer.add(1, 12);
        ozer.add(60);
        System.out.println("ozer = " + ozer);

    }
}
