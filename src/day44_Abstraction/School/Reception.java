package day44_Abstraction.School;

public class Reception extends TeachingStaff implements Teach{
    public Reception(String title, char gender, String name, int age) {
        super(title, gender, name, age);
    }
}
