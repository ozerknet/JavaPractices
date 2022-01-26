package day08_IfStatements;

public class ZPrac3 {
    public static void main(String[] args) {
        int score = 55;
        boolean passed = score >= 60 ;
        boolean failed = !passed ;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);
    }
}
