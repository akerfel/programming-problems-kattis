import java.util.Scanner;

public class different {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(Math.abs(in.nextLong() - in.nextLong()));
        }
    }
}
