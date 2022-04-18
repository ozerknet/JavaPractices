package day30_CustomClass;

public class ZClassTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Jony";
        dog1.color = "white";
        dog1.breed = "yahsi";
        dog1.age = 2;
        dog1.gender = 'M';
        dog1.size = "small";


        Dog dog2 = new Dog();
        dog2.name = "Mike";
        dog2.color = "Black";
        dog2.breed = "ters";
        dog2.age = 5;
        dog2.gender = 'F';
        dog2.size = "big";

        System.out.println(dog1);
        System.out.println(dog2);


        Dog dog3 = new Dog();
        dog3.setInfo("Jony","Kacak",7,'M',"small","yellow");

        System.out.println(dog3);

        ZPrac2MyStudent student1 = new ZPrac2MyStudent();
        student1.addStudent("ozer",'M',38,1221,'A');
        System.out.println(student1);
    }




}
