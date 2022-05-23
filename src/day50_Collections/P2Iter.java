package day50_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class P2Iter {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"));

        Iterator<String> each =names.iterator();

        while(each.hasNext()){
            if(each.next().equalsIgnoreCase("ahmed")){
                each.remove();
            }
        }
        System.out.println(names);



    }
}
