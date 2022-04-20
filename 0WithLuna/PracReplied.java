import java.util.Scanner;

public class PracReplied {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        //DO NOT CHANGE ABOVE CODE!  Write your code below
        String teacher = "Chen";

        if (name.equalsIgnoreCase(teacher)){
            System.out.println("teacher");
        }else{
            System.out.println("student");
        }



    }
}




/*

The variable name holds a String user input

Write a conditional statement that will determine if the person is a student or teacher.

If name is equal to "Chen", print "teacher"
For any other input, print "student"
Examples:

input: Chen
output: teacher
copied!
input: Chen
output: teacher
input: Faa
output: student






*/