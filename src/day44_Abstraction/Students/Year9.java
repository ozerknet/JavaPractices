package day44_Abstraction.Students;

public final class Year9 extends Student implements Sleep{


    public Year9(int ID, String name, char gender, int age, int yearClass) {
        super(ID, name, gender, age, yearClass);
    }

    //---------------------------------------------------------------------------------------------


    @Override
    public void exam() {
        System.out.println(getName() + getYearClass() + "taking 13+ Exam.");

    }

    @Override
    public void eat() {
        System.out.println(getName() + "eating lunch at canteen");
    }

    @Override
    public void drive() {
        System.out.println(getName()+" can not drive car but use bycle.");

    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping min 9 hours.");
    }
}
