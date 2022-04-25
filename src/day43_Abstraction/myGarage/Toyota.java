package day43_Abstraction.myGarage;

public class Toyota extends Car{

    public Toyota(String brand, String model, int year) {
        super(brand, model, year);
    }

    public void start() {
        System.out.println("Twist the key to ignition");
    }


}
