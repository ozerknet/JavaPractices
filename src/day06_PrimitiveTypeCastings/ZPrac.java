package day06_PrimitiveTypeCastings;

public class ZPrac {
    public static void main(String[] args) {
        byte a = (byte) 100000;
        short b = a;


        int c = b ;
        System.out.println("c = " + c);

        long d = c; 
    }
}
