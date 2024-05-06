package Review;

import java.util.Arrays;
import java.util.Scanner;

public class Update {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        Scanner sc=new Scanner(System.in);
        System.out.println("Input number you want to update :");
        int element= sc.nextInt();
        System.out.println("Input numb/er you need to insert :");
        int toUpdate=sc.nextInt();
        for (int i = 0; i<arr.length; i++){
            if(arr[i]==element){
                arr[i]=toUpdate;
                break;
            }

        }
        System.out.println("New element of arr are "+ Arrays.toString(arr));
    }


}
