package day25_CustomMethods_Overloading;

import day23_CustomMethods_Void.utilities.StringUtility;

public class ZPrac2 {
    public static void main(String[] args) {

        String str = "Civic";

        StringUtility.printEachChar(str);
        String result = StringUtility.reverse(str);
        System.out.println("result = " + result);

        Boolean isItPandrome = StringUtility.isPalindrome(str);
        System.out.println(str + " is It Pandrome ? = " + isItPandrome);

        //StringUtility.myLine();

        StringUtility.removeDuplicates(str);




    }
}
