package day38_Inheritance.MyCarTask;

public class Garage {
    public static void main(String[] args) {
        Bmw BW1 = new Bmw("X5", 2006, 12000, "red", 140000);


        System.out.println("BW1 = " + BW1);

        BW1.start();
        BW1.racing();
    }


}
