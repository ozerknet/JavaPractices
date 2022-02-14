package day16_ForLoopStringPractice;

public class ZPrac1_Palidrome {
    public static void main(String[] args) {
        
        String word = "civic";
        
        String reversed = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            reversed += word.charAt(i);
            System.out.println(reversed);
            
        }
        boolean isPalindrome = word.equalsIgnoreCase((reversed));

        System.out.println("isPalindrome = " + isPalindrome);
        
        
    }
}
