// open.kattis.com/problems/calories
// python3 submit.py calories.java
import java.util.Scanner;

public class calories {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int[][] grid = new int[4][4];
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                grid[x][y] = in.nextInt();
            }
        }

        //  0, 1, 2, or 3 that denotes a left, up, right, or down move 
        int dir = in.nextInt();

        // left
        if (dir == 0) { 
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    int xt = x;
                    int yt = y;

                    while (true) {
                        // If left square is empty, move there.
                        if (grid[xt - 1][yt] == 0 && xt - 1 >= 0) {
                            grid[xt - 1] = xt;
                            grid[xt] = 0;
                            xt--;
                        }

                        // If left has same value, merge and stop.
                        if (grid[xt - 1][yt] == grid[xt][yt]) {
                            grid[xt - 1][yt] = grid[xt][yt] * 2;
                            grid[xt][yt] = 0;
                            break;
                        }
                    }
                }
            }
        }

        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                System.out.print(grid[x][y] + " ");
            }
            System.out.println("");
        }
    }
}
