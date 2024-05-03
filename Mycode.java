package Mycolor;
import java.io.Console;

class example_io {
    public static void main(String[] args) {
        Console cons = System.console();
        if (cons == null) {
            System.out.println("Unable to get console. Exiting.");
            System.out.println("hell world");
            return;
        }

        System.out.println("Enter your favorite color:");
        String colour = cons.readLine();

        if (colour != null) {
            System.out.println("Favorite colour is " + colour);
        } else {
            System.out.println("No input received.");
        }
    }
}
