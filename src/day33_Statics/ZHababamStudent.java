package day33_Statics;

import java.util.Arrays;

public class ZHababamStudent {
    public String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;

    public ZHababamStudent(String name) {
        this.name = name;
    }

    public ZHababamStudent(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public ZHababamStudent(String name, char gender, int age) {
        this(name,gender);
        this.age = age;
    }

    public ZHababamStudent(String name, char gender, int age, int studentID) {
        this(name, gender, age);
        this.studentID = studentID;
    }

    public ZHababamStudent(String name, char gender, int age, int studentID, char grade) {
       this(name, gender, age, studentID);
        this.grade = grade;
    }
    
   

    public String toString() {
        return "ZHababamStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }

    public static void main(String[] args) {

        ZHababamStudent s1 = new ZHababamStudent("ozer",'F',28,1221,'A');
        ZHababamStudent s2 = new ZHababamStudent("ozer",'F',28,1221,'A');
        ZHababamStudent s3 = new ZHababamStudent("ozer",'F',28,1221,'A');

        System.out.println(s1);


        ZHababamStudent[] students = { s1, s2, s3};

        System.out.println(Arrays.toString(students));
    }

}
