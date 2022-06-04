package day49_Collections;

import java.lang.reflect.Array;
import java.util.*;

public class PrSetInterface {
    public static void main(String[] args) {


        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(300, 449, 657, 12341, 123, 1231));
        System.out.println(hashSet);



        Set<Integer> linkedHashSet = new LinkedHashSet<>();





        Set<Integer> treeSet = new TreeSet<>();
        SortedSet<Integer> tree = new TreeSet<>();
        tree.addAll(Arrays.asList(34,1,3,6,8,34,21,7,0,null));
        System.out.println("tree = " + tree);


    }
}
