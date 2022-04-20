import java.util.Arrays;
import java.util.Scanner;

public class arrayClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] nums = {input.nextInt(),input.nextInt()};
        System.out.println(Arrays.toString(nums));
    }
}
