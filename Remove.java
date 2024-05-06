package Review;

import java.util.ArrayList;
import java.util.List;

public class Remove {
    public static void main(String[] args) {
        List<Integer> num=new ArrayList<>(4);

        num.add(12);
        num.add(13);
        num.add(14);
        num.add(17);
        int index=3;
        System.out.println("Before remove :"+ num);
        num.remove(index);
        System.out.println("After remove :"+num);
        num.remove(Integer.valueOf(12));
        System.out.println("remove by value :"+num);
    }

}
