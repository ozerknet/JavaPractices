package week03;

public class ZPrac3 {
    public static void main(String[] args) {
        int b = 2;
        boolean res = (++b == 2) || (--b == 2) && (--b == 2);
                        // false      true          true
                        //-------------------true
        System.out.println("res = " + res);
    }
}
