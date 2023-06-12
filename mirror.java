// open.kattis.com/problems/mirror
import java.util.Scanner;

public class mirror {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            int R = in.nextInt();
            int C = in.nextInt();

            System.out.println("Test " + (i+1));
            
            String[] lines = new String[R];
            for (int y = 0; y < R; y++) {
                lines[y] = in.next();
            }

            for (int y = R - 1; y >= 0; y--) {
                for (int x = C - 1; x >= 0; x--) {
                    System.out.print(lines[y].charAt(x));
                }
                System.out.println();
            }
        }

    }
}
