package day44_Abstraction.School;

public class Student extends Person implements Learn{


    public Student(char gender, String name, int age) {
        super("Student", gender, name, age);
    }


    @Override
    public void learn() {
        System.out.println(getName() + " is learning");;
    }
}
