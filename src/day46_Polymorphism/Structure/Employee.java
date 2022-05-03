package day46_Polymorphism.Structure;

public class Employee extends Person implements EatDinnerRoom,DrinkFromFountain{

    public Employee(String name, int age, char gender) {
        super(name, age, gender);
    }
    //---------------------------------------------------------------------------------------------










    //---------------------------------------------------------------------------------------------



    @Override
    public void eat() {

    }

    @Override
    public void work() {

    }





    @Override
    public void Dinner() {
            System.out.println(getName() + " can eat hall.");
        }

    @Override
    public void Drink() {
        System.out.println(getName() + " can drink here.");
    }
}
