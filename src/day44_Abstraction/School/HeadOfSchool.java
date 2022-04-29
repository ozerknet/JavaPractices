package day44_Abstraction.School;

public class HeadOfSchool extends TeachingStaff implements Teach{
    public HeadOfSchool(char gender, String name, int age) {
        super("Head of School", gender, name, age);
    }



    @Override
    public void teach(){
        System.out.println(getName() + " is teaching");
    }
}
