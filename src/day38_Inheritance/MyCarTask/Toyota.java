package day38_Inheritance.MyCarTask;

public class Toyota extends Car{
    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliabile(){
        System.out.println("Reliabile ..");
    }
}
