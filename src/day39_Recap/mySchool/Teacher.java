package day39_Recap.mySchool;

public class Teacher extends Employee {


    public Teacher(String name, String surName, int age, char gender, int employeeId, String jobTitle, int salary) {
        super(name, surName, age, gender, employeeId, jobTitle, salary);

    }

    public void createTicket(){
        System.out.println(getJobTitle() + " " + getName() + " is creating ticket.");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " "+ getName() + " is teaching.");
    }
}
