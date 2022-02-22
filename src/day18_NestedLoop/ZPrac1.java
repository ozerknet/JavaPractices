package day18_NestedLoop;

public class ZPrac1 {
    public static void main(String[] args) {
        int a = 123;
        int b=11;
        int count =0;


        while(a >= b){
            a -= b;
            count++;
        }
        System.out.println("count = " + count);
        System.out.println(count+" with a remainder of "+a);
    }
}
