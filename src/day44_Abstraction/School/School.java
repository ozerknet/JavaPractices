package day44_Abstraction.School;

import java.util.ArrayList;

public class School {
    public static void main(String[] args) {

        ArrayList<Person> schoolPersons = new ArrayList<>();
        Person Kevin = new HeadOfSchool('M',"Kevin",38);
        schoolPersons.add(Kevin);

        Person Ozer = new SiteManager("SiteManager",'M',"Ozer",42);
        schoolPersons.add(Ozer);

        Person Ali = new Nursery('M',"Ali",41);
        schoolPersons.add(Ali);

        Person Ahmet = new Student('M', "Ahmet",12);
        schoolPersons.add(Ahmet);

        // System.out.println(schoolPersons.toString());

        for (Person schoolPerson : schoolPersons) {
            System.out.println(schoolPerson);

        }


    }
}
