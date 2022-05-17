package day49_Collections;

import java.util.*;

public class PrCollections {
    public static void main(String[] args) {


        List<Integer> listArrayList = new ArrayList<>();
        List<Integer> listLinkedList = new LinkedList<>();
        List<Integer> listVector = new Vector<>();
        Vector<Integer> vectorStack = new Stack<>();


        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();
        Set<Integer> set3 = new TreeSet<>();


        SortedSet<Integer> sortedSetTreeSet = new TreeSet<>();
        sortedSetTreeSet.addAll(Arrays.asList(100,2,2,80,6,4,456,7,8,67));


        System.out.println("sortedSetTreeSet = " + sortedSetTreeSet);

        Queue<Integer> queDeque = new ArrayDeque<>();
        Queue<Integer> queLinkedList = new LinkedList<>();





    }
}
