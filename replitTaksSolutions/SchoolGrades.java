import java.util.Scanner;

public class SchoolGrades {
    public static void main(String[] args) {


        String subject1, subject2, subject3, subject4, subject5;
        double grade1, grade2, grade3, grade4, grade5, grade6;
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to the Grader!\nPlease enter subject name number 1 and score for this subject");
        subject1 = s.next();
        grade1 = s.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        subject2 = s.next();
        grade2 = s.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");
        subject3 = s.next();
        grade3 = s.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject");
        subject4 = s.next();
        grade4 = s.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this subject");
        subject5 = s.next();
        grade5 = s.nextDouble();

        grade6 = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;

        System.out.printf("Summary: %s - %.1f, %s - %.1f, %s - %.1f, %s - %.1f, %s - %.1f\nYour average score is: %.1f\nThank you for using Grader!\nGoodbye!", subject1, grade1, subject2, grade2, subject3, grade3, subject4, grade4, subject5, grade5, grade6);
    }
}


/*
Write the program that will calculate the average grade.
Use 5 String variables and 6 double variables to hold the subject and the grade value.
Build a summary with all the information by concatenating the subjects and grades.
Then calculate the average grade and print display the average score too.

Execution flow with example:

Welcome to the Grader!
Please enter subject name number 1 and score for this subject
Math
5.0
Please enter subject name number 2 and score for this subject
Biology
4.2
Please enter subject name number 3 and score for this subject
English
4.4
Please enter subject name number 4 and score for this subject
Chemistry
4.8
Please enter subject name number 5 and score for this subject
Music
3.4
​
Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8, Music - 3.4
Your average score is: 4.36
Thank you for using Grader!
Goodbye!
* */