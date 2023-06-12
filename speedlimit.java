// open.kattis.com/problems/speedlimit
// python3 submit.py speedlimit.java
import java.util.Scanner;

public class speedlimit {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            int n = in.nextInt();
            if (n == - 1) {
                return;
            }
            int totalDistance = 0;
            int totalTime = 0;
            for (int i = 0; i < n; i++) {
                int v = in.nextInt();
                int t = in.nextInt();

                totalDistance += (t - totalTime) * v;
                totalTime = t;
            }
            System.out.println(totalDistance + " miles");
        }
    }
}
