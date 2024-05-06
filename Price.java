package Review;

import lombok.*;

import java.util.LinkedHashMap;
import java.util.Set;

 class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Price, String> hm = new LinkedHashMap<>();
        hm.put(new Price("Banana", 20), "Banana");
        hm.put(new Price("Apple", 40), "Apple");
        hm.put(new Price("Orange", 30), "Orange");
        printMap(hm);
        Price key = new Price("Banana", 20);
        System.out.println("Does key available? " + hm.containsKey(key));
    }

    public static void printMap(LinkedHashMap<Price, String> map) {
        Set<Price> keys = map.keySet();
        for (Price p : keys) {
            System.out.println(p + "==>" + map.get(p));
        }
    }
}

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Price {
    private String item;
    private int price;
}

