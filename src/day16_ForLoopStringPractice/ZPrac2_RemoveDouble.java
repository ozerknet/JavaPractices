package day16_ForLoopStringPractice;

public class ZPrac2_RemoveDouble {
    public static void main(String[] args) {

        String word = "AABvCCddegkjkkLl";

        String result ="";

        for (int i = 0; i < word.length()-1; i++) {

            String ch = ""+word.charAt(i);

            if(!result.contains(ch)){
                result += ch;
            }
        }
        System.out.println(result);
    }
}
