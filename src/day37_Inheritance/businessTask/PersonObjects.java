package day37_Inheritance.businessTask;

import day37_Inheritance.animalTask.Dog;

public class PersonObjects {
    public static void main(String[] args) {

        Manager manager1 = new Manager("Ozer",39,'M');
        Manager manager2 = new Manager("Elif",29,'F');
        Manager manager3 = new Manager("Ali",19,'M');
        System.out.println("----------------------- Our Managers -------------------------");

        System.out.println("manager1 = " + manager1);
        System.out.println("manager2 = " + manager2);
        System.out.println("manager3 = " + manager3);

        System.out.println("----------------------- Our Staffs -------------------------");

        Staff staff1 = new Staff("Ali", 90,'M');
        Staff staff2 = new Staff("Dilek", 80,'F');
        Staff staff3 = new Staff("Osman", 30,'M');

        System.out.println("staff1 = " + staff1);
        System.out.println("staff2 = " + staff2);
        System.out.println("staff3 = " + staff3);
        
    }
}
