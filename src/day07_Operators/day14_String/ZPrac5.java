package day07_Operators.day14_String;

public class ZPrac5 {
    public static void main(String[] args) {
        
        String email = "Cydeo.school@gmail.com";

        // domain:
        int beginningIndex = email.indexOf("@");
        int endingIndex =email.lastIndexOf(".");
        
        String domain = email.substring(beginningIndex,endingIndex);

        System.out.println("domain = " + domain);
        

        
    }
}
