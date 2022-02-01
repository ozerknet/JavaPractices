package day02_PrintStatements.day10_Task;

public class GradeLevel {
    public static void main(String[] args) {
        int level = 15;

        if (level >= 1 && level <= 18) { // if level is valid

            if (level <= 5) { // if student Elementary school
                System.out.println("Elementary school");
            } else if (level <= 8) { // if the student Middle school
                System.out.println("Middle school");
            } else if (level <= 12) { // if the student High school
                System.out.println("High school");
            } else if (level <= 16) { // if the student College
                System.out.println("College");
            } else { // if the student Grad School
                System.out.println("Grad School");
            }
        } else { //if the score is not valid

            System.out.println("Invalid grade level given");

        }
    }
}
