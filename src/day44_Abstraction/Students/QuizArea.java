package day44_Abstraction.Students;

public class QuizArea {
    public static void main(String[] args) {

        Year5 ali = new Year5(14,"Ali",'M',11,5);
        System.out.println(ali);

        ali.exam();
        ali.drive();
        ali.eat();
        ali.sleep();

        Year9 kemal = new Year9(12,"Kemal",'M',41,9);
        System.out.println(kemal);

        Year13 mike = new Year13(14,"Mike",'M',41,13);
        Year11 dilek = new Year11(14,"Dilek",'F',46,11);

        dilek.talk();


    }



}
