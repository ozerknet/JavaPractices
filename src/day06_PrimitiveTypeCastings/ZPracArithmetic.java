package day06_PrimitiveTypeCastings;

public class ZPracArithmetic {
    public static void main(String[] args) {
        // addition - subtraction - division - multiplication - modulus

        int x = 10;
        int y = 1;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

        /*
        integer / integer ====> integer
        decimal / integer ====> decimal
        integer / decimal ====> decimal
        decimal / decimal ====> decimal
         */

        int a = 100;
        double b = a / 6;
        System.out.println(b);
    }


}
