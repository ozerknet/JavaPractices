package day30_CustomClass;

public class ZPrac2MyStudent {
    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;

    public void addStudent(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public String toString() {
        return "ZPrac2MyStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }
}
