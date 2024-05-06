package Review;

public class Max {
    public static void main(String[] args) {
        int[] num={12,34,56,1,2};
        int max=num[0];
        for (int j : num) {
            max = Math.max(max, j);
        }
        System.out.println("Maximum is "+max);
    }
}
