package day14_String;

public class ZPrac2 {
    public static void main(String[] args) {
        String email = "ozerknet@hotmail.com";
        
        email = email.replace("hotmail", "gmail");

        System.out.println("email = " + email);
        
        
        String sentences = "Sokakta Sayamam Gibi AGR";
        sentences = sentences.replace("okakta","");
        System.out.println("sentences = " + sentences);
    }
}
