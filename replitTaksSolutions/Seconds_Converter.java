import java.util.Scanner;

public class Seconds_Converter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputSeconds, hours, minutes, seconds;

        System.out.println("Enter seconds: ");
        inputSeconds = scan.nextInt();

        hours = (inputSeconds/3600);

        minutes = (inputSeconds/60) % 60; // remaining minutes

        seconds = inputSeconds%60; // calculate remaining seconds

        String result = hours + " hours, " + minutes + " minutes, and " + seconds + " seconds" ;
        System.out.print(result);
    }
}

/*
* Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.

Create a Scanner object
Declare int variables inputSeconds, hours, minutes, seconds
Ask user enter seconds by printing:

"Enter seconds:"

Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.

Assign values to the hours, minutes, seconds variables

Display the result.

Example:

Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds

*/