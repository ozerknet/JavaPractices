package day17_While_DoWhile;

public class ZWhileCountPrac1 {
    public static void main(String[] args) {

        String sentence = " cat dog bird cat dog cat cat Cat CAT" ;

        int count = 0;
        sentence = sentence.toLowerCase();

        while (sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat","");
            count++;
        }
        System.out.println("count = " + count);
    }
}
