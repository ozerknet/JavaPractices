package day23_CustomMethods_Void;

public class ZPrac5 {
    public static void main(String[] args) {


        printNumber(20, 15);


    }

    public static void printNumber(int x, int y) {

        boolean xBig = x>y;
        boolean yBig = y>x;

        if(!xBig){
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }

        }
        if(!yBig){
            for (int i = y; i <= x; i++) {
                System.out.println(i);
            }

        }


    }
}
