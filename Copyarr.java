package Review;

import java.util.Arrays;

public class Copyarr {
    public static void main(String[] args) {
        //using copyof
//        int[] arr={11,12,13,14,15};
//        int[] arrcopy= Arrays.copyOf(arr,5);
//        System.out.println(Arrays.toString(arrcopy));

        //using copyofRange
        int[] arr = {11, 12, 13, 14, 15};
        //copyofRange
//        int[] arrcopy = Arrays.copyOfRange(arr, 3,5);
//        System.out.println(Arrays.toString(arrcopy));
        int value=32;
       Arrays.fill(arr, 3,5,value);
        System.out.println(Arrays.toString(arr));
    }
}
