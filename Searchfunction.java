package Review;

public class Searchfunction {
    public static int binary(int[] arr, int num){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==num){
                return mid;
            }
            if (arr[mid]<num){
                 start=mid+1;
            }
            else {
                 end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int index=binary(new int[]{1,2,3,4,5,6,7},8);
        if(index!=-1){
            System.out.println("The number found at index "+ index);
        }
        else {
            System.out.println("The number is not found !");
        }
    }
}
