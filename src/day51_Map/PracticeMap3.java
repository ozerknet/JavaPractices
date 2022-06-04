package day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class PracticeMap3 {
    public static void main(String[] args) {


        String str = "bbbbbcccaadddddahhhhhhaa";
        //           bca
        //           235
        String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : arr) { // each: characters of string
            int frequency = Collections.frequency( Arrays.asList(arr), each);
            result.put(each,  frequency  );
        }

        System.out.println(result);



    }
}
