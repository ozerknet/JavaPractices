public class Task1 {
    public static void main(String[] args) {

        String word = "Heyet";

        int strLength = word.length();

        if (strLength > 5) {
            System.out.println("Too long!");

        } else if (strLength < 5) {
            System.out.println("Too short!");

        }

        String reverseStr = word.charAt(4) + "" + word.charAt(3) + "" + word.charAt(2) + "" + word.charAt(1) + "" + word.charAt(0);
        System.out.println("reverseStr = " + reverseStr);


    }
}


/*

1.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
    If word is shorter, display message: "Too short!".
    If word is longer, display message: "Too long!".
    Otherwise, reverse this word and print out result into the console.
[11:06]
has anyone get this questions solution?
[11:06]
is there any formula to reverse a string?

*/