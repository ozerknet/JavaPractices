package day38_Inheritance.MyCarTask;

public class Bmw extends Car{
    public Bmw(String brand, String model, int year, double price, String color, int miles) {
        super(brand, model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println("Breaks down");
    }
    public void racing(){
        System.out.println(brand + "Racing want");
    }
}
