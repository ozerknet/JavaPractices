package day08_IfStatements;

public class ZPrac {
    public static void main(String[] args) {
        int key = 1; // anahtar var.
        String person = "adam";

        boolean carStart =  key == 2 && person == "adam";

        if (carStart){
            System.out.println("Car Working");
        }else{
            System.out.println("key or person need");
        }
    }
}
