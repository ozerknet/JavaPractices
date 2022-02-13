public class Substring {
    public static void main(String[] args) {

        String firstName = "oMerVaHID";
        String lastName = "Kutuk";

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        System.out.println(firstName);

        String firsChar = (""+firstName.charAt(0));
        System.out.println("firsChar = " + firsChar);

    }
}
