package day11_Switch_Scanner;

public class Zprac2 {
    public static void main(String[] args) {
        int number = 7;

        String result = (number >= 0 && number <= 9) ?

                (number == 0) ? "Zero" : (number == 1) ? "one" : (number == 2) ? "two" : (number == 3) ? "Three" :
                        (number == 4) ? "four" : (number == 5) ? "five" : (number == 6) ? "six" :
                                (number == 7) ? "seven" : (number == 8) ? "eight" : "nine"

        : "Invalid number" ;

        System.out.println(result);
    }
}
