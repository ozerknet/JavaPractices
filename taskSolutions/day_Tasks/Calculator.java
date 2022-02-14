package day09_Tasks;


public class Calculator {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 2;
        int result = 0;
        char mathOperator = '-';


        if (mathOperator == '+'){
            result = (n1 + n2);
        }else if (mathOperator == '-'){
            result = n1 - n2;
        }else if (mathOperator == '*'){
            result = n1 * n2;
        }else if (mathOperator == '/'){
            result = n1 / n2;
        }else {
            System.out.println("Invalid operator");
        }
        System.out.println(result);


    }
}
