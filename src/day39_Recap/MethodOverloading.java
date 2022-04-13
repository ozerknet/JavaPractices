package day39_Recap;

public class MethodOverloading {

    public static void main(String[] args) {
        method1();
        method1(5);
        method1(2);
    }
   private static void method1(){
       System.out.println("hello");
    }

    private static int method1(int a){
        return a;
    }


}
