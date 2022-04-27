package day44_Abstraction.MyAnimal;

public final class Parrot extends Animal implements Fly  {


    public Parrot(String name, int age, char gender, String color) {
        super(name, age, gender, color);
    }


    @Override
    public void fly() {

    }
}
