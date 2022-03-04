package day06_PrimitiveTypeCastings.day20_Arrays;

public class ZPrac3 {
    public static void main(String[] args) {

        String[] words = {"Ozer", "Kamil", "Hasan", "Dayi", "Doktor", "Ayse", "Elif", "Derya","Ozer"};

        for (int j = 0; j < words.length; j++) {
            String element = words[j]; // ozer

            int freq = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equalsIgnoreCase(element)) {
                    freq++;
                }

            }

            if(freq==2){
                System.out.println(element);
            }
        }



    }
}
