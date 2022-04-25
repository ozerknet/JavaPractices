package day43_Abstraction.myGarage;

public class Toyota extends Car{

    public Toyota(String model, int year) {
        super("Toyota", model, year);
    }

    public void start() {
        System.out.println("Twist the key to ignition");
    }


}
