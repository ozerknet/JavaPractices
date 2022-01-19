package day05_String_Concatenation;

public class ZString1 {
    public static void main(String[] args) {
        String firstName = "Arzu";
        String lastName = "Nisan";
        String fullName = firstName + " " + lastName;
        int age = 43;
        String jobTitle = "SDET";
        String companyName = "Polipost";
        double salary = 45000;

        System.out.println("Full name of the person is " + fullName);

        System.out.println(fullName + " is" + age + " years old.");
        System.out.println(fullName + " is " + jobTitle + "," + "works at " + companyName + "." + fullName + " salary is " + salary);

    }


}
