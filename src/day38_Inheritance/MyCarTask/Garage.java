package day38_Inheritance.MyCarTask;

public class Garage {
    public static void main(String[] args) {
        Bmw BW1 = new Bmw("X5", 2006, 12000, "red", 140000);
        Tesla Tes1 = new Tesla("Z",2002,152000,"brown",25000);
        Toyota Toy1 = new Toyota("Auris", 2010, 42000, "black", 440000);


        System.out.println("Bmw = " + BW1);
        System.out.println("Tesla = " + Tes1);
        System.out.println("Toyota = " + Toy1);

        BW1.start();
        BW1.racing();
    }


}
