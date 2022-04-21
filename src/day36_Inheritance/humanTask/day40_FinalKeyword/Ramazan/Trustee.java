package day36_Inheritance.humanTask.day40_FinalKeyword.Ramazan;

public class Trustee extends AreaManager {

    int NumberOfPersonMakingIftar;
    String IftarNameOfPlace;

    public Trustee(int numberOfPersonMakingIftar, String iftarNameOfPlace) {
        NumberOfPersonMakingIftar = numberOfPersonMakingIftar;
        IftarNameOfPlace = iftarNameOfPlace;
    }

    public void iftar(String TrusteeName, int numberOfPersonMakingIftar, String IftarNameOfPlace) {
        System.out.println(TrusteeName + " is invited " + numberOfPersonMakingIftar + "at" + IftarNameOfPlace);
    }

}
