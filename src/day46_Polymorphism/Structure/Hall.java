package day46_Polymorphism.Structure;

import java.util.ArrayList;

public class Hall {

    public static void main(String[] args) {

        ArrayList<Person> HallAllPersons = new ArrayList();

        Person Eren = new Volunteer("Eren", 41, 'M', 001);

        HallAllPersons.add(Eren);

        Person Ozer = new Volunteer("Ozer", 2, 'M', 002);

        HallAllPersons.add(Ozer);

        Person Kamil = new StartVol("Kamil",12,'M',0050);

        HallAllPersons.add(Kamil);

        for (Person hallAllPerson : HallAllPersons) {
            System.out.println(hallAllPerson);

        }

        Employee Erkan = new Employee("Erkan",62,'M');
        Erkan.Dinner();

        Erkan.Drink();

        Person Ahmet = new Volunteer("Ahmet", 41,'M',0025);

        Ahmet.Drink();

        Person Elif = new Volunteer("elif",20,'F',520);

        Elif.Drink();

    }

}

