package day11_Switch_Scanner;

public class ZPrac1 {
    public static void main(String[] args) {
        String browserName = "apple";

        String result = "";

        boolean validBrowser = browserName == "chrome" || browserName == "firefox" || browserName == "opera" || browserName == "safari" || browserName == "safari";


        if (validBrowser) { // if chrome is valid

            if (browserName == "chrome") {
                result = "Chrome browser selected";
            } else if (browserName == "firefox") {
                result = "Firefox browser selected";
            } else if (browserName == "opera") {
                result = "Opera browser selected";
            } else if (browserName == "safari") {
                result = "Safari browser selected";
            }
        } else {

            result = "Invalid browser selected";

        }

        System.out.println(result);
    }
}

