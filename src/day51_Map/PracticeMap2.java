package day51_Map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class PracticeMap2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("Cemal", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 125000);
        map.put("Steven", 135000);

        String maxName = "";
        int maxSalary = Integer.MIN_VALUE;

        String minName = "";
        int minSalary = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String eachKey = pair.getKey();
            Integer eachValue = pair.getValue();

            if (eachValue > maxSalary) {
                maxSalary = eachValue;
                maxName = eachKey;
            }
            if (eachValue < minSalary) {
                minSalary = eachValue;
                minName = eachKey;
            }


        }
        System.out.println(maxName + " --> " + maxSalary);
        System.out.println(minName + " --> " + minSalary);

        // int maxSalary = Collections.max(map.values());


//        for (Map.Entry<String, Integer> pair : map.entrySet()) {
//            if (pair.getValue() == maxSalary) {
//                System.out.println(pair.getKey());
//            }
//        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if(pair.getValue()<120000){
                System.out.println(pair.getKey());
            }
        }

    }
}
