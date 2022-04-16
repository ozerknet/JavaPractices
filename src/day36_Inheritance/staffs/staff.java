package day36_Inheritance.staffs;

public class staff {
    private String name;
    private int age;
    private char gender, grade;

    public static boolean isStaff = true;
    public static String companyName = "Polipost";

    public staff(String name, int age, char gender, char grade) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 5 || age > 90) {
            return;
        }
        this.age = age;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            return; // exits the method without action
        }
        this.gender = gender;
    }

    public void setGrade(char grade) {
        if (!(grade == 'A' || grade == 'B' || grade == 'A' || grade == 'C' || grade == 'D' || grade == 'F')) {
            return;
        }
        this.grade = grade;
    }


    public String toString() {
        return "staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }


}