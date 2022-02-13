import java.util.Scanner;

public class MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int middle;
        int Length = word.length();
        boolean even = (Length % 2) == 0;
        boolean twoChar = Length == 2;

        if (!even && Length > 3 || (Length == 3)) {
            middle = (Length / 2);
            System.out.println(word.charAt(middle));
        } else if (Length == 1) {
            System.out.println(word + word + word);
        } else if (even && Length > 3 || (Length == 4)) {

            char bir = word.charAt((Length / 2) - 1);

            char iki = word.charAt((Length / 2));

        } else if (twoChar) {
            System.out.println(word + word);
        }


    }
}


/*

You have a word, do the following:

When word has odd number of characters and:
3 or more characters, print middle letter
      oak ==> a
      oak ==> a
      javav ==> v
      javav ==> v
Single character, print that character 3 times
      # ==> ###
      # ==> ###
      q ==> qqq
      q ==> qqq
When word has even number of characters and:
4 or more characters, print the middle 2 characters
     java ==> av
     java ==> av
     apples ==> pl
     apples ==> pl
     #$%^&* ==> %^
     #$%^&* ==> %^
2 characters, print those 2 characters twice
      @@ ==>@@@@
      @@ ==>@@@@
      $$ ==>$$$$
      $$ ==>$$$$
      hi ==> hihi

*
*
*
*
*
*
*
*
*
* */