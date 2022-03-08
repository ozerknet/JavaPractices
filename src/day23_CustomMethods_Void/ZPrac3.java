package day23_CustomMethods_Void;

public class ZPrac3 {
    public static void main(String[] args) {

        oddOrEven(142577);

    }

    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }

    }

}
