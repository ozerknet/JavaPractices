package day09_IfStatements;

public class ZPrac3 {
    public static void main(String[] args) {

        int x = 0;

        boolean positive = x > 0;
        boolean negative = x < 0;


        if (positive) {
            System.out.println("Positive");
        } else if (negative) {
            System.out.println("Negative");
        } else {
            System.out.println("ZERO");
        }
    }
}
