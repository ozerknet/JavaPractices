package day24_CustomMethods_Return;

public class ZPracReverse {
    public static void main(String[] args) {
        String str = "madam";
        //0123

        System.out.println(str.length());

        String result = reverseFunc(str);

        System.out.println(result);

        if(str.equalsIgnoreCase(result)){
            System.out.println(str + " is a palindrome");
        }else{
            System.out.println(str + " is not palindrome");
        }



    }

    public static String reverseFunc(String str) {
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);    // reverse = reverse + str.charAt(i)
            //    =   "" +   a
            //    = a + v
            //    = av + a
            //    = ava + J
        }
        return reverseStr+" --- Merhaba ---";
    }
}
