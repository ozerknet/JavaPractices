package day44_Abstraction.School;

public class School {
    public static void main(String[] args) {
        HeadOfSchool Kevin = new HeadOfSchool('M',"Kevin",38);

        Nursery Ali = new Nursery('M',"Ali",41);
        System.out.println(Kevin);
        System.out.println(Ali);

        Kevin.teach();


        Student ahmet = new Student('M', "Ahmet",12);

        ahmet.learn();
    }
}
