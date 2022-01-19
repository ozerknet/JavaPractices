package day05_String_Concatenation;

public class ZCalculator {
    public static void main(String[] args) {
        int firstNumber = 100;
        int secondNumber = 50;
        int addition = firstNumber+secondNumber;
        int subtraction = firstNumber-secondNumber;
        int times = firstNumber*secondNumber;

        //100+50 = 150

        System.out.println(firstNumber +"+"+ secondNumber +"=" + addition);

        //100-50 = 50
        System.out.println(firstNumber +"-"+ secondNumber +"=" + subtraction);


        //100*50 = 500
        System.out.println(firstNumber +"*"+ secondNumber +"=" + times);


    }
}
