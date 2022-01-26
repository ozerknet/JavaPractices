package day08_IfStatements;

public class ZPrac2 {
    public static void main(String[] args) {
        String student1 = "Ozer";
        String studen2 = "Ali";

        double student1Gpa = 3.5;
        double student2Gpa = 1.5;

        int student1FamilyIncome = 10000;
        int student2FamilyIncome = 140000;

        boolean isEligibleStudent1 = student1Gpa >= 3.5 || student1FamilyIncome <= 60000;
        boolean isEligibleStudent2 = student2Gpa >= 3.5 || student2FamilyIncome <= 5000;

        if (isEligibleStudent1) {
            System.out.println("Student 1 : You won burs");
        } else {
            System.out.println("Student 1 : You are not eligible for burs");
        }

        if (isEligibleStudent2) {
            System.out.println("Student 2 : You won burs");
        } else {
            System.out.println("Student 2 : You are not eligible for burs");
        }
    }

}
