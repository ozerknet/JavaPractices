package day02_PrintStatements.day10_Task;

public class BiggerNum {
    public static void main(String[] args) {
        int n1 = 111;
        int n2 = 12;
        int n3 = 3;

        String result   =  (n1>n2 &n1>n3)? "n1 is bigger" : (n2>n1 &n2>n3)? "n2 is bigger" : "n3 is bigger" ;

        System.out.println("result = " + result);
    }
}
