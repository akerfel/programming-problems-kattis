import java.util.Scanner;

public class aaah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String jonAh = in.next();
        String docAh = in.next();
        if (jonAh.length() >= docAh.length()) {
            System.out.println("go");
        }
        else {
            System.out.println("no");
        }
    }
}
