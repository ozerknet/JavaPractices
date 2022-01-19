package day04_Variables;
/*
* In Java, there are different types of variables, for example:

String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false
* */
public class ZV2 {
    public static void main(String[] args) {

        String name = "Mike";
        int age = 38;
        float height = (float) 1.63;
        char gender = 'M';
        boolean study = true;
        System.err.println("Mike Information");
        System.out.println("----------------------");
        System.out.println("name = " + name );
        System.out.println("age = " + age );
        System.out.println("height = " + height );
        System.out.println("gender = " + gender );
        System.out.println("study = " + study );



    }
}
