import java.util.Scanner;

public class SchoolGrades {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String SubjectNameNumber1, SubjectNameNumber2, SubjectNameNumber3, SubjectNameNumber4, SubjectNameNumber5;
        double ScoreSubject1, ScoreSubject2, ScoreSubject3, ScoreSubject4, ScoreSubject5;

        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject ");
        SubjectNameNumber1 = scan.next();
        ScoreSubject1 = scan.nextInt();

        System.out.println("Please enter subject name number 2 and score for this subject ");
        SubjectNameNumber2 = scan.next();
        ScoreSubject2 = scan.nextInt();

        System.out.println("Please enter subject name number 3 and score for this subject ");
        SubjectNameNumber3 = scan.next();
        ScoreSubject3 = scan.nextInt();

        System.out.println("Please enter subject name number 4 and score for this subject ");
        SubjectNameNumber4 = scan.next();
        ScoreSubject4 = scan.nextInt();

        System.out.println("Please enter subject name number 5 and score for this subject ");
        SubjectNameNumber5 = scan.next();
        ScoreSubject5 = scan.nextInt();

        System.out.println("Summary: " + SubjectNameNumber1 + "-" + ScoreSubject1 + "," + SubjectNameNumber2 + "-" + ScoreSubject2 + "," +
                SubjectNameNumber3 + "-" + ScoreSubject3 + "," + SubjectNameNumber4 + "-" + ScoreSubject4 + "," + SubjectNameNumber5 + "-" + ScoreSubject4 + "\n" +
                "Your average score is: " + ((ScoreSubject1 + ScoreSubject2 + ScoreSubject3 + ScoreSubject3 + ScoreSubject4 + ScoreSubject5) / 5) + "\n" +
                "Thank you for using Grader!\n" +
                "Goodbye!");


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