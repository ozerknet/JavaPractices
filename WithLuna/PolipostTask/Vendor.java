package PolipostTask;

public class Vendor extends Person {
    String howLongWork;

    public Vendor(String type, String name, char gender, int age, String howLongWork) {
        super(type,name, gender, age);
        this.howLongWork = howLongWork;
    }

    public void sell(){
        System.out.println(name+" is selling");
    }

    public String toString() {
        return "Vendor{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", howLongWork='" + howLongWork + '\'' +
                '}';
    }
}
