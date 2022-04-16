package day21_ForEachLoop;


import java.util.Arrays;
import java.util.Scanner;

public class ZPrac1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        String name = "Huseyin"
//        System.out.println(name);

        String[] arr = new String[6]; //  = { "ozer", "mike","jony", "Doktor","Leyla","Arzu"}
                                        //      0       1      2       3        4        5
        for (int i=0;i<6;i++){  // i = i+1
            System.out.println("Lutfen isim giriniz : ");
            arr[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(arr));




    }
}
