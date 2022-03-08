package day24_CustomMethods_Return;

public class ZPrac5 {
    public static void main(String[] args) {
        String word = "Ozer Kutuk";
        String temp = "";
        for (int i = 0; i < word.length(); i++) {
            temp += word.valueOf(word.charAt(i));
        }
        System.out.println(temp);
    }
}


// Bir string degerinden istedigin indexd karaterini alma valueOf() ;
