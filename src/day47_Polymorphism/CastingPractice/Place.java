package day47_Polymorphism.CastingPractice;

public class Place {
    public static void main(String[] args) {
        First one = new Second1();

        one.call();

        First two = new Second2();

        two.call();

        First three = new Second3();

        three.call();

        ((Second1) one).meeting();


    }

}
