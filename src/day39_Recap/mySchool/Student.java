package day39_Recap.mySchool;

public class Student extends Person{
    private int studentId;
    private String classroomname;
    private int yearOfClass;

    public Student(String name, String surName, int age, char gender, int studentId, String classroomname, int yearOfClass) {
        super(name, surName, age, gender);
        this.studentId = studentId;
        this.classroomname = classroomname;
        this.yearOfClass = yearOfClass;
    }

    public void study(){
        System.out.println(studentId+ " " +getName() + "is studying.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", surName='" + getSurName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender()+
                ", studentId='" + studentId + '\'' +
                ", classroomname='" + classroomname + '\'' +
                ", yearOfClass=" + yearOfClass +
                '}';
    }
}
