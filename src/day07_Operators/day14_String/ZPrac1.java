package day07_Operators.day14_String;

public class ZPrac1 {
    public static void main(String[] args) {
        String s = " Java CAva Wawa orange";
        int second = s.indexOf("av");
        int foruthA = s.lastIndexOf("av")+1;
        int fifthA = s.lastIndexOf("a W");

        System.out.println("second = " + second);
        System.out.println("foruthA = " + foruthA);
        System.out.println("fifth = " + fifthA);

        System.out.println("------------------------------------------------------");


    }
}
