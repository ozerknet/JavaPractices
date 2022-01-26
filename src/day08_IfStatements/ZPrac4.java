package day08_IfStatements;

public class ZPrac4 {
    public static void main(String[] args) {
        int number = 30;
        boolean evenNumber = number%2==0;
        
        if (evenNumber){
            System.out.println(number + " is even number");
        }else {
            System.out.println(number + " is odd number");
        }
        
    }
}
