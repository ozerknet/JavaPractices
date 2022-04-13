package day39_Recap.mySchool;

public class School {
    public static void main(String[] args) {
        System.out.println("------------- Manager ----------------------");
        Manager ozer = new Manager("Ozer","Kutuk",35,'M',125,"Manager",12000);

        System.out.println(ozer);

        System.out.println("------------- Teacher ----------------------");
        Teacher mike = new Teacher("Ahmet","Ver",45,'M',145,"Teacher",45000);
        System.out.println(mike);

        System.out.println("------------- Student ----------------------");
        Student ayse = new Student("Ayse","Kal",25,'F',412,"Birds",9);
        System.out.println(ayse);
    }
}
