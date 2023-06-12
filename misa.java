// open.kattis.com/problems/misa
// python3 submit.py misa.java
import java.util.Scanner;

public class misa {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int h = in.nextInt();
        int w = in.nextInt();

        boolean[][] m = new boolean[h][w];
        for (int y = 0; y < h; y++) {
            String row = in.next();
            for (int x = 0; x < w; x++) {
                if (row.charAt(x) == 'o') {
                    m[y][x] = true;
                }
            }
        }

        // Place mirko
        int mirkoNeighbors = -1;
        int mirkoX = -1;
        int mirkoY = -1;
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                if (!m[y][x]) {
                    int neighbors = getNeighbors(m, x, y, w, h);
                    if (neighbors > mirkoNeighbors) {
                        mirkoNeighbors = neighbors;
                        mirkoX = x;
                        mirkoY = y;
                    }
                }
            }
        }
        if (mirkoNeighbors != -1) {
            m[mirkoY][mirkoX] = true;
        }
        
        // Count shakes (twice for each shake)
        int shakes = 0;
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                if (m[y][x]) {
                    shakes += getNeighbors(m, x, y, w, h);
                }
            }
        }

        System.out.println(shakes/2);
    }

    public static int getNeighbors(boolean[][] m, int xp, int yp, int w, int h) {
        int neighbors = 0;

        for (int y = yp - 1; y <= yp + 1; y++) {
            for (int x = xp - 1; x <= xp + 1; x++) {
                if (x > -1 && y > -1 && x < w && y < h && !(x == xp && y == yp)) {
                    if (m[y][x]) {
                        neighbors++;
                    }
                }
            }
        }

        return neighbors;
    }
}
