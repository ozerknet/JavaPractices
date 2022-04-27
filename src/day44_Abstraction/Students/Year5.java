package day44_Abstraction.Students;

public final class Year5 extends Student implements Sleep{

    public Year5(int ID, String name, char gender, int age, int yearClass) {
        super(ID, name, gender, age, yearClass);
    }


    //---------------------------------------------------------------------------------------------

    @Override
    public void exam() {
        System.out.println(getName() + " taking 11+ Exam.");

    }

    @Override
    public void eat() {
        System.out.println(getName() + " eating lunch at school");
    }

    @Override
    public void drive() {
        System.out.println(getName()+" can not drive car. using bus.");

    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeping 5 hours.");
    }
}
