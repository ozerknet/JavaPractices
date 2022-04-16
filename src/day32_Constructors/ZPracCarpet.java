package day32_Constructors;

public class ZPracCarpet {

    public Double width;
    public Double length;
    public Double unitPrice;
    public boolean isPersian;

    public ZPracCarpet(Double width, Double length, Double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double totalPrice = (width*length)*unitPrice;

        if(isPersian){
            totalPrice += 200;
        }

        return totalPrice;
    }

    public String toString() {
        return "ZPracCarpet{" +
                "witdh=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price= $" + calcCost() +
                '}';
    }
}
