package day24_CustomMethods_Return;

public class ZPrac6 {

    public static void main(String[] args) {
        int maxNumber = max(200, 45);
        System.out.println(maxNumber);

        int multiplication2times = maxNumber*2;
        System.out.println("multiplication2times = " + multiplication2times);
    }

    public static int max(int a, int b) {
        int result = 0;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }

        return result;
    }


}
