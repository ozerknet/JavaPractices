package day38_Inheritance.MyCarTask;

public class Tesla extends Car{
    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println("Car on autopilot...");
    }


}
