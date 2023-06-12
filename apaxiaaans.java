import java.util.Scanner;

public class apaxiaaans {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String shortName = "" + name.charAt(0);
        for (int i = 1; i < name.length(); i++) {
            if (name.charAt(i-1) != name.charAt(i)) {
                shortName += name.charAt(i);
            }
        }
        System.out.println(shortName);
    }
}
