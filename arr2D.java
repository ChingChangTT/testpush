package Review;

import java.util.Scanner;

public class arr2D {
    public static void main(String[] args) {
        int[][] arr=new int[2][2];
        Scanner sc=new Scanner(System.in);
        System.out.println("Input your number:");
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
//                System.out.println("Input your number:");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Output");
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(ints[j] + "  ");
            }
            System.out.println();
        }
    }
}
