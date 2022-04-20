import java.util.Scanner;

public class Day15String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.next();
        input.close();
        Character first = word.charAt(0);

        String wordNew = word.replace('x','a').replace('X','a');
        System.out.println("newStr = " + wordNew);

//        if(first == 'x'){
//            String newStr = word.substring('a');
//            System.out.println(newStr);
//        }


    }
}

/*



 */