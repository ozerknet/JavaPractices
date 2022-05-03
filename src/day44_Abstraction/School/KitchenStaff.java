package day44_Abstraction.School;

public class KitchenStaff extends Staff implements Cook{
    public KitchenStaff(String title, char gender, String name, int age) {
        super(title, gender, name, age);
    }
}
