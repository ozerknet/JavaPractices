package day43_Abstraction.shape;

public final class Regtangle extends Shape {

    private double length, width;

    public Regtangle(String name, double length, double width) {
        super(name);
        setLength(length);
        setWidth(width);
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new RuntimeException("Invalid Length: " + length);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new RuntimeException("Invalid Width: " + width);
        }
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public double hypotenuse() {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    public String toString() {
        return "Rectangle   {" +
                ", Length: " + length +
                ", Width: " + width +
                ", Area: " + area() +
                ", Perimeter: " + perimeter() +
                ", Hypotenuse: " + hypotenuse() +
                '}';
    }

}
