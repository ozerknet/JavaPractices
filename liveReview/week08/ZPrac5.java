package week08;

import java.util.Arrays;

public class ZPrac5{
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};

        System.out.println("Before reverse" + Arrays.toString(nums));

        for (int i = 0; i < nums.length/2; i++) {
            int temp = nums[i];
            nums[i]= nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;
        }
        System.out.println("After revers " + Arrays.toString(nums));
    }
}
