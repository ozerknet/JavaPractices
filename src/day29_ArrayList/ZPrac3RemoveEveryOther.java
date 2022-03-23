package day29_ArrayList;

import java.util.ArrayList;

public class ZPrac3RemoveEveryOther {
    public static void main(String[] args) {

        ArrayList<Integer> words = new ArrayList<>();
        // removeEveryOther(words);



    }
    public static ArrayList<String> removeEveryOther(ArrayList<String> words){

        words.removeIf(p -> words.indexOf(p)%2==0 );

        return words;
    }

}
