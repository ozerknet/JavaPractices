package PolipostTask;

public class Customer extends Person {

    private String area;
    int ID;

    public Customer(String type,String name, char gender, int age, String area, int ID) {
        super(type,name, gender, age);
        this.area = area;
        this.ID = ID;
    }

    public String toString() {
        return "Customer{" +
                "area='" + area + '\'' +
                ", ID=" + ID +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public void buy(){
        System.out.println(name+" is buying.");
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
