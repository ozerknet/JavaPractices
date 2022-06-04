package day50_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class P1Iterable {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 9, 10));

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            if (it.next() <= 5) {
                it.remove();
            }
        }
        System.out.println(list);

        System.out.println("===================================================");

        list.removeIf(each -> each < 9);
        System.out.println(list);

        System.out.println("===================================================");



    }


}
