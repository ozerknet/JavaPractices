package day13_String;

public class Zprac4_Str {
    public static void main(String[] args) {
        String s = new String("To stay safe in your job search and flexible work we recommend that you visit JobsAware for information and to get free, expert advice for safer work.");

        String firstName = "Ozer";
        String lastName = "Kutuk";
        System.out.println(firstName.charAt(0) + "." + lastName.charAt(0));

        System.out.println(s.charAt(6));


        System.out.println("length() = " + s.length());

        System.out.println("toLowerCase() = " + s.toLowerCase());

        System.out.println("toUpperCase() = " + s.toUpperCase());

        System.out.println("trim() = " + s.trim());

        System.out.println("indexOf(5) =" + s.indexOf(0));

        System.out.println("lastIndexOf() = " + s.lastIndexOf(5));

        char lastChar = s.charAt(s.length() - 1);
        System.out.println("lastChar = " + lastChar);


    }


}
