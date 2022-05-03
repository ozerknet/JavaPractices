package day44_Abstraction.School;

public class Nursery extends TeachingStaff implements Teach{
    public Nursery(char gender, String name, int age) {
        super("Nursery", gender, name, age);
    }


    @Override
    public void teach(){
        System.out.println(getName() + " is teaching Nursery.");
    }
}
