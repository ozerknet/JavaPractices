package day46_Polymorphism.Structure;

public class Volunteer extends Person implements DrinkFromFountain{

    private int number;

    public Volunteer(String name, int age, char gender, int number) {
        super(name, age, gender);
        this.number = number;
    }


    //---------------------------------------------------------------------------------------------


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {

        if (number <= 0) {
            System.out.println("Invalid number");
        } else {
            this.number = number;
        }
    }
    //---------------------------------------------------------------------------------------------

    @Override
    public void eat() {
        System.out.println(getName() + " is eating from Mc Donalds.");
    }

    @Override
    public void work() {
        System.out.println(getName() + " is working only 3 hours.");
    }

    //---------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Volunteer{" +
                super.toString() +
                "number=" + number +
                '}';
    }

    @Override
    public void Drink() {
        System.out.println(getName() + " is drinking.");
    }
}
