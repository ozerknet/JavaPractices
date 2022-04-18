package Cydeo.Statements;//The variable **name** holds a String user input
//
//        Write a conditional statement that will determine if the person is a student or teacher.
//
//        - If name is equal to "Chen", print "teacher"
//        - For any other input, print "student"
//
//        Examples:
//
//        ```
//        input: Chen
//        output: teacher
//        ```
//
//        ```
//        input: Faa
//        output: student
//        ```

import java.util.Locale;
import java.util.Scanner;

public class _2_005_Statements_ConditionalStatementPractice3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        //DO NOT CHANGE ABOVE CODE!  Write your code below

        switch (name.toLowerCase())
        {
            case "chen":
                System.out.println("teacher");
                break;
            default:
                System.out.println("student");
                break;
        }
    }
}
