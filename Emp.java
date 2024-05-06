package Review;

import lombok.*;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

 class EmployeeTreeMapDemo {
    public static void main(String[] args) {
        // By using name comparator (String comparison)
        TreeMap<Emp, String> tm = new TreeMap<>(Comparator.comparing(Emp::getName));
        tm.put(new Emp("Ram", 3000), "RAM");
        tm.put(new Emp("John", 6000), "JOHN");
        tm.put(new Emp("Crish", 2000), "CRISH");
        tm.put(new Emp("Tom", 2400), "TOM");
        printMap(tm);
        System.out.println("===================================");

        // By using salary comparator (int comparison)
        TreeMap<Emp, String> trmap = new TreeMap<>(Comparator.comparingInt(Emp::getSalary));
        trmap.put(new Emp("Ram", 3000), "RAM");
        trmap.put(new Emp("John", 6000), "JOHN");
        trmap.put(new Emp("Crish", 2000), "CRISH");
        trmap.put(new Emp("Tom", 2400), "TOM");
        printMap(trmap);
    }

    public static void printMap(TreeMap<Emp, String> map) {
        Set<Emp> keys = map.keySet();
        for (Emp key : keys) {
            System.out.println(key + " ==> " + map.get(key));
        }
    }
}

@Data
@AllArgsConstructor
 public class Emp {
    private String name;
    private int salary;
}
