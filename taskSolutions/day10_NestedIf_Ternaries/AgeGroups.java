package day10_Task;

public class AgeGroups {
    public static void main(String[] args) {
        /*Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )
                    */
        int age = 0;
        if (age >= 0 && age <= 150) {
            if (age < 21) {
                System.out.println("Teenager");
            } else if (age >= 21 && age < 55) {
                System.out.println("Adult");
            } else if (age >= 55) {
                System.out.println("Adult");
            }
        } else {
            System.out.println("invalid");
        }
    }
}
