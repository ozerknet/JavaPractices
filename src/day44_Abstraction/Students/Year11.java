package day44_Abstraction.Students;

public final class Year11 extends Student implements Sleep, Talk{
    public Year11(int ID, String name, char gender, int age, int yearClass) {
        super(ID, name, gender, age, yearClass);
    }


    //---------------------------------------------------------------------------------------------

    @Override
    public void exam() {
        System.out.println(getName() + getYearClass() + "taking college Exam.");

    }

    @Override
    public void eat() {
        System.out.println(getName() + "eating lunch at COSTA");
    }

    @Override
    public void drive() {
        System.out.println(getName()+" can drive car.");

    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping min 11 hours.");
    }
}
