package day13_String;

// import java.lang.String; --> special package so we do not need import

public class ZPrac3_StringInt {
    public static void main(String[] args) {

        String name = "Wooden Spoon";

        String s1 = "Cat";

        String s2 = "Cat";

        String s3 = new String("Cat");

        boolean a = s1 == s2; // true
        boolean b = s1 == s3; // false

        System.out.println("a = " + a);
        System.out.println("b = " + b);


        String st1 = new String("Wood");
        String st2 = new String("Wood");

        boolean result = st1 == st2;

        System.out.println("result = " + result);


        System.out.println("---------------------------------------------------------------------");
        String x = "JAVA";
        String y = new String("Java");
        System.out.println(x.equals(y));


        System.out.println(x.toLowerCase());


    }
}
