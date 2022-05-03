package day46_Polymorphism;

import day45_Abstraction.shape.Circle;

public class Poly {
    public static void main(String[] args) {
        String str = "Wooden spoon";
        Integer i1 = 2;
        Double d1 = 3.5;
        Boolean b1 = true;

        Object[] array = {str,d1,b1, new Circle(4)};
/*
        System.out.println(array.length);
        System.out.println(array[3]);
        System.out.println(array[2]);
        System.out.println(array[1]);
        System.out.println(array[0]);
*/
        for (Object o : array) {

            System.out.println(o.toString());
        }


    }
}
