package day02_PrintStatements.day10_Task;

public class Grade {
    public static void main(String[] args) {
        char grade = 'G';
        if (grade >= 'A' || grade >= 'B' || grade >= 'C' || grade >= 'D' || grade >= 'F') { // if grade is valid

            if (grade == 'A') { // if grade is A
                System.out.println("excellent");
            } else if (grade == 'B') { // if grade is B
                System.out.println("great job");
            } else if (grade == 'C') { // if grade is C
                System.out.println("good");
            } else if (grade == 'D') { // if grade is D
                System.out.println("passed");
            } else if (grade == 'F') { // if grade is F
                System.out.println("failed");

            } else { //if

                System.out.println("invalid ");

            }
        }
    }
}
