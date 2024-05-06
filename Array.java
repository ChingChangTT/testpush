package Review;

public class Array {
    public static void main(String[] args) {
        int[][] nums={{1,2},{3,4},{5,6}};
        int[] next={1,2,3,4,5};
        nums=new int[][]{{1,1,2},{2,2,3},{3,3,4},{4,4,5}};
        next=new int[]{6,7,8,9,12};
        for (int n=0;n<5;n++){
            System.out.print(next[n]+"  ");
        }
        System.out.println();
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(nums[i][j]+"   ");
            }
            System.out.println("\n");
        }
    }
}
