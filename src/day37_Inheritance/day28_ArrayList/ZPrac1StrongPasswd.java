package day37_Inheritance.day28_ArrayList;

public class ZPrac1StrongPasswd {
    public static void main(String[] args) {

        String password = "Cydeo1990@";

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;  // has upper case
        boolean r3 = false;  // has lower case
        boolean r4 = false;  // has special char
        boolean r5 = false;  // has digit

        char[] chars = password.toCharArray();

        for (char each : chars) {
            if (Character.isUpperCase(each)) {
                r2 = true;
            }
            if (Character.isLowerCase(each)) {
                r3 = true;
            }
            if (Character.isDigit(each)) {
                r5 = true;
            } else {
                r4 = true;
            }

        }

        boolean isStrongPasswd = r1 && r2 && r3 && r4 && r5;
        System.out.println("isStrongPasswd = " + isStrongPasswd);

    }
}
