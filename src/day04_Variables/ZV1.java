package day04_Variables;

public class ZV1 {
    public static void main(String[] args) {
        double PI = 3.14;
        int radius = (int) 6.5;
        int diameter = radius * 2;
        int  area = (int) (diameter * PI);

        System.out.println("diameter = " + diameter);
        System.err.println("area = "+ area);
    }
}
