package day44_Abstraction.MyAnimal;

public final class Fish extends Animal implements Swim {


    public Fish(String name, int age, char gender, String color) {
        super(name, age, gender, color);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming.");
    }
}
