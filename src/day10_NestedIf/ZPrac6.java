package day10_NestedIf;

public class ZPrac6 {
    public static void main(String[] args) {
        int score = 50;

        String result = (score >= 0 && score <= 100) ? (score >= 60) ? "Passed" : "Failed" : "Invalid score" ;

        System.out.println("result = " + result);

/*
        if (score >= 0 && score <= 100) { // if score is valid

            if (score >= 60) { // if student passed the exam
                System.out.println("Passed");
            } else { // if the student failed exam
                System.out.println("Failed");
            }


        } else { //if the score is not valid

            System.out.println("Invalid score");

        }

 */

    }
}
