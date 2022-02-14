package day15_ForLoop;

public class ZPrac8 {
    public static void main(String[] args) {

        String str = "ozer";
        System.out.println("str length: " + str.length());

String result= "";
        for (int i = str.length()-1; i >= 0; i--) { //i: index numbers of str (starting last index to index 0 )
            result += str.charAt(i); // adding each character to result
        }
        System.out.println(result);
    }
}


