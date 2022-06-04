package day51_Map;

import java.util.*;

public class PracticeMap1 {
    public static void main(String[] args) {
/*
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();
        Map<Integer, String> hashtable = new Hashtable<>();

        hashMap.put(1,"Ozer");
        hashMap.put(1,"Mike");
        System.out.println(hashMap);
 */
        Map<String, Integer> studentScore = new HashMap<>();
        System.out.println("studentScore = " + studentScore);
        System.out.println(studentScore.size());
        studentScore.put("Abdullah", 100);
        studentScore.put("Ali", 50);
        studentScore.put("Kemal", 75);
        studentScore.put("Cemal", 90);


        System.out.println(studentScore);

        Map<String, Integer> earlyBirds = new HashMap<>(); // score >= 90
        Map<String, Integer> angryBirds = new HashMap<>(); // score < 90

        for (String key : studentScore.keySet()) {
            Integer value = studentScore.get(key);
            if (value >= 90) {
                earlyBirds.put(key, value);
            } else {
                angryBirds.put(key, value);
            }
        }


        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);


        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;
        for (Integer score : studentScore.values()) {
            if (score > maxScore) {
                maxScore = score;
            }
            if (score < minScore) {
                minScore = score;
            }
        }
        System.out.println("minScore = " + minScore);
        System.out.println("maxScore = " + maxScore);

        System.out.println("----------------------------------------------------");

        for (Map.Entry<String, Integer> entry : studentScore.entrySet()) {
            System.out.println(entry.getKey() +" = "+ entry.getValue());
        }

    }
}
