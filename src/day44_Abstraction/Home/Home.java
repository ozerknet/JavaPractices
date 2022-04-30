package day44_Abstraction.Home;

import java.util.ArrayList;

public class Home {
    public static void main(String[] args) {
        Children omer = new Children("Omer",9, 'M');
        Children eren = new Children("Eren",5, 'M');
        Children hulya = new Children("Hulya",3, 'F');
        Children yusuf = new Children("Yusuf",2, 'M');

        Parents ozer = new Parents("Ozer",41,'M');
        Parents arzu = new Parents("Arzu",40,'F');

        ArrayList<String> allPeople = new ArrayList<>();

        allPeople.add(0,omer.toString());
        allPeople.add(0,eren.toString());
        allPeople.add(0,hulya.toString());
        allPeople.add(0,yusuf.toString());
        allPeople.add(0,ozer.toString());
        allPeople.add(0,arzu.toString());
        System.out.println(allPeople);












    }
}
