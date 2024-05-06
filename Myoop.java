package Review;
class Information{
    public String name="Ching";
    public int age=19;
public int getID(){
        return 123;
    }
}
public class Myoop extends Information{
    public String job="Student";
    public String gender="female";
    public void display(){
        System.out.println(name);
        System.out.println(getID());
        System.out.println(age);
        System.out.println(job);
        System.out.println(gender);
    }
}
class Output{
    public static void main(String[] args) {
        Myoop obj=new Myoop();
        obj.display();
    }
}
