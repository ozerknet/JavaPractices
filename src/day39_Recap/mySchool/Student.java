package day39_Recap.mySchool;

public class Student extends Person{
    private String studentId;
    private String classroomname;
    private int yearOfClass;

    public Student(String name, String surName, int age, char gender, String studentId, String classroomname, int yearOfClass) {
        super(name, surName, age, gender);
        this.studentId = studentId;
        this.classroomname = classroomname;
        this.yearOfClass = yearOfClass;
    }


}
