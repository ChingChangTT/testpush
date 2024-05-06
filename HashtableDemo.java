package Review;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Employee, String> tm = new Hashtable<>();
        tm.put(new Employee(134, "Ram", 3000), "RAM");
        tm.put(new Employee(235, "John", 6000), "JOHN");
        tm.put(new Employee(876, "Crish", 2000), "CRISH");
        tm.put(new Employee(512, "Tom", 2400), "TOM");
        System.out.println("Fecthing value by creating new key:");

        Employee e = new Employee(512, "Tom", 2400);
        System.out.println(e + " ==> " + tm.get(e));
    }
}

@Data
@EqualsAndHashCode
class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Override toString for the same output
    @Override
    public String toString() {
        return "Id: " + this.id + " -- Name: " + this.name + " -- Salary: " + this.salary;
    }
}
