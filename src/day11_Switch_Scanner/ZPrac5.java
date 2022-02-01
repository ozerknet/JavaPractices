package day11_Switch_Scanner;

public class ZPrac5 {
    public static void main(String[] args) {
        char c = 'G';
        switch (c) {
            case 'A':
                System.out.println("Excellent");
                break;// if you do not put break it is continue other area.
            case 'B':
                System.out.println("Great job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
