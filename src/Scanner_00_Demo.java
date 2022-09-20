import java.util.*;

public class Scanner_00_Demo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("How old are you? ");  // prompt
        int age = console.nextInt();
        System.out.println("You typed " + age);
    }
}
