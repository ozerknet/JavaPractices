package day38_Inheritance.MyCarTask;

public class Bmw extends Car{
    public Bmw( String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println("Breaks down");
    }
    public void racing(){
        System.out.println(brand + "Racing want");
    }
}
