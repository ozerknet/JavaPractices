package PolipostTask;

public class Partner extends Person {
    String companyName;
    int budged;

    public Partner(String type,String name, char gender, int age, String companyName, int budged) {
        super(type,name, gender, age);
        this.companyName = companyName;
        this.budged = budged;
    }
    public void profit(){
        System.out.println(name+" is profitting.");
    }

    public String toString() {
        return "Partner{" +
                "companyName='" + companyName + '\'' +
                ", budged=" + budged +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
