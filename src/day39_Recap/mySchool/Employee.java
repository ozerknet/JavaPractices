package day39_Recap.mySchool;

public class Employee extends Person {
    private String employeeId;
    private String jobTitle;
    private int salary;

    public Employee(String name, String surName, int age, char gender, String employeeId, String jobTitle, int salary) {
        super(name, surName, age, gender);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            System.err.println("This salary is not right" + salary);
        }
        this.salary = salary;
    }


    public void work() {
        System.out.println(getName() + "is working ");
    }

    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", surName='" + getSurName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
