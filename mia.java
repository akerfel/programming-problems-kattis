// open.kattis.com/problems/mia
// python3 submit.py mia.java
import java.util.Scanner;

public class mia {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            int s0 = in.nextInt();
            int s1 = in.nextInt();
            int r0 = in.nextInt();
            int r1 = in.nextInt();

            if (s0 == 0) {
                return;
            }

            int s_score = getScore(s0, s1);
            int r_score = getScore(r0, r1);

            if (s_score > r_score) {
                System.out.println("Player 1 wins.");
            }
            else if (s_score == r_score) {
                System.out.println("Tie.");
            }    
            else {
                System.out.println("Player 2 wins.");
            }
        }
    }

    public static int getScore(int a, int b) {
        if ((a == 1 && b == 2) || (a == 2 && b == 1)) {
            return 10000;
        }

        if (a == b) {
            return a * 100;
        }

        if (a > b) {
            return a * 10 + b;
        }
        else {
            return b * 10 + a;
        }
    }
}
