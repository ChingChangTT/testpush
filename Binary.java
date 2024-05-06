package Review;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class Binary {
    public static void main(String[] args) {
        int[] arr = {7, 2, 8, 4, 5, 1};
        Arrays.sort(arr);
        System.out.println("Enter the number you want to search for:");
        int num = new Scanner(System.in).nextInt();


         int index = binarySearch(arr, num);

        if (index<0) {

            System.out.println("Element is not found" );
        } else {
            System.out.println(" Element found at index :"+index);
        }
    }
}