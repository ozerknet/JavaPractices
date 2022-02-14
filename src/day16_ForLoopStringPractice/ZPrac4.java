package day16_ForLoopStringPractice;

public class ZPrac4 {
    public static void main(String[] args) {
        String str = "ABCDE1234567890) (*&^%$#@!";

        String digits = ""; //12345
        String letters = ""; // CydeoWoodenSpoon
        String specialChars = ""; //!@#$%

        for (int i = 0; i < str.length()-1; i++) {

            char ch = str.charAt(i);

            if(ch>='0' && ch<='9'){
                digits+=ch;
            }else if(ch>='A' && ch<='Z') {
                letters += ch;
            }else if(ch>='a' && ch<='z') {
                letters += ch;
            }else{
                specialChars+=ch;
            }


        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(specialChars);






    }
}
