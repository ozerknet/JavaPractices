import java.util.Arrays;

public class ZPrac4 {
    public static void main(String[] args) {


        String str = "Sokakta Sayamam Gibi AGR";

        String [] array = new String[str.length()];
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < str.length(); i++) {
            array[i] = "" +str.charAt(i);
           // System.out.println(str.charAt(i));
        }

        System.out.println(Arrays.toString(array));


                
           
        }

    }

