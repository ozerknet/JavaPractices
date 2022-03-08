
import java.util.Scanner;

public class PracWithAbdullah {
    public static void main(String[] args) {
        // DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int day = scan.nextInt();

        //WRITE YOUR CODE HERE
        String result;

        switch (day) {
            case 1:
                result = "Monday";
                System.out.println(result);
                break;

            case 2:
                result = "Tuesday";
                System.out.println(result);
                break;

            case 3:
                result = "Wednesday";
                System.out.println(result);
                break;

            case 4:
                result = "Thursday";
                System.out.println(result);
                break;

            case 5:
                result = "Friday";
                System.out.println(result);
                break;

            case 6:
                result = "Saturday";
                System.out.println(result);
                break;
            case 7:
                result = "Sunday";
                System.out.println(result);
                break;
            default:
                result = "Not a valid day";
                System.out.println(result);
        }
    }
}


/*

Write a program that will print a week days according to the day number.
Use Switch statement. If an invalid day is entered print: "Not a valid day"

Example

Enter number:
1
​
Output: Monday
Enter number:
1

Output: Monday
Enter number:
7
​
Output: Sunday






*/