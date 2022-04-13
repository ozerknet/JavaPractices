package day39_Recap.mySchool;

public class Manager extends Employee {
    public Manager(String name, String surName, int age, char gender, String employeeId, String jobTitle, int salary) {
        super(name, surName, age, gender, employeeId, jobTitle, salary);
    }

    public void fixingProblems(){
        System.out.println(getName() + " is fixing problems.");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+ getName() + "is working.");
    }
}
