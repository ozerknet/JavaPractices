package day13_String;
import java.util.*;
public class ZPrac1 {

        public static void main(String[] args) {
            /*
            Scanner s = new Scanner(System.in);
            System.out.println("---------------");
            System.out.println("select an option:");
            System.out.println("1) option 1");
            System.out.println("2) option 2");
            System.out.println("3) option 3");
            System.out.println("---------------");
            int selected = s.nextInt();
            System.out.println("user selected "+ selected);

            if (selected == 1 ){
                System.out.println("Wow, you choose lucky number");
            }else{
                System.out.println("Try again");
            }

            */

            //-------------------------------------------------------------

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number:");
            int x = scan.nextInt();
            System.out.println(x<5 ? -x : x);


        }
}
