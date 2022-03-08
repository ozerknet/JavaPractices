package day24_CustomMethods_Return;

public class ZPrac4 {
    public static void main(String[] args) {

        String str = "aabbccddfeehjjk";

        for (int i = 0; i < str.length(); i++) {

            int frequency = frenquecyFunc(str, str.charAt(i));

            if(frequency == 1){
                System.out.println(str.charAt(i));
            }
        }

    }

    public static int frenquecyFunc(String str, char ch) {
        int count = 0;

        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }
}
