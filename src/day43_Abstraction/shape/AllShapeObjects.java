package day43_Abstraction.shape;

import day31_Constructors.Rectangle;

public class AllShapeObjects {
    public static void main(String[] args) {

        Square sq = new Square(14);
        System.out.println(sq);

        Circle cr = new Circle(12);
        System.out.println(cr);

        Rectangle rec = new Rectangle(14,10);
        System.out.println(rec);

    }
}
