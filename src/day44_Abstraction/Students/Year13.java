package day44_Abstraction.Students;

public final class Year13 extends Student implements Sleep {
    public Year13(int ID, String name, char gender, int age, int yearClass) {
        super(ID, name, gender, age, yearClass);
    }

    //---------------------------------------------------------------------------------------------

    @Override
    public void exam() {
        System.out.println(getName() + getYearClass() + "taking UNVERSITY Exam.");

    }

    @Override
    public void eat() {
        System.out.println(getName() + "eating lunch at McDonalds");
    }

    @Override
    public void drive() {
        System.out.println(getName()+" can drive car and motorcyle.");

    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping min 13 hours.");
    }

}
