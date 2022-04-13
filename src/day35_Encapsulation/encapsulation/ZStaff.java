package day35_Encapsulation.encapsulation;

public class ZStaff {

    private String name;
    private char gender;
    private int age;
    private double salary;

    public ZStaff(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }


    public void setName(String name) {
        if (name.isEmpty()) {
            return;
        }
        this.name = name;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            return;
        }
        this.gender = gender;
    }

    public void setAge(int age) {
        if (age < 16 || age > 90) {
            return;
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            return;
        }
        this.salary = salary;


    }


    public String toString() {
        return "ZStaff{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}