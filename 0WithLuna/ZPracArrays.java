import java.util.Arrays;

public class ZPracArrays {
    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 3};

        System.out.println(arr.length);

        int temp = arr[0];
            // 3                              4 na
            //  2                             3
            //   1                            2
           //    0                            1
                            // 2
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
            // 0         0  + 1 = 1
            // 1         1  + 1 = 2
            // 2         2  + 1 = 3
            // 3         3 + 1 =  4

        }
                //
        arr[arr.length - 1] = temp;

        System.out.println(Arrays.toString(arr));
        
        String [] gameBorad = new String[9];
        System.out.println("Arrays.toString(gameBorad) = " + Arrays.toString(gameBorad));

    }
}
