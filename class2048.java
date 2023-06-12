// open.kattis.com/problems/2048
// python3 submit.py 2048.java
import java.util.Scanner;

public class class2048 {
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

        boolean[][] wasCreatedThisTurn = new boolean[4][4];

        // left
        if (dir == 0) { 
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    if (grid[x][y] != 0) {
                        int xt = x;
                        int yt = y;

                        while (xt > 0) {
                            // If left square is empty, move there.
                            if (xt - 1 >= 0 && grid[xt - 1][yt] == 0) {
                                grid[xt - 1][yt] = grid[xt][yt];
                                grid[xt][yt] = 0;
                                xt--;
                            }

                            // If left has same value, merge and stop.
                            else if (grid[xt - 1][yt] == grid[xt][yt] && !wasCreatedThisTurn[xt - 1][yt]) {
                                grid[xt - 1][yt] *= 2;
                                grid[xt][yt] = 0;
                                wasCreatedThisTurn[xt - 1][yt] = true;
                                break;
                            }

                            // If left has another value, stop
                            else {
                                break;
                            }
                        }
                    }
                }
            }
        }
        // right
        if (dir == 2) { 
            for (int x = 3; x >= 0; x--) {
                for (int y = 0; y < 4; y++) {
                    if (grid[x][y] != 0) {
                        int xt = x;
                        int yt = y;

                        while (xt < 3) {
                            // If left square is empty, move there.
                            if (xt + 1 >= 0 && grid[xt + 1][yt] == 0) {
                                grid[xt + 1][yt] = grid[xt][yt];
                                grid[xt][yt] = 0;
                                xt++;
                            }

                            // If left has same value, merge and stop.
                            else if (grid[xt + 1][yt] == grid[xt][yt] && !wasCreatedThisTurn[xt + 1][yt]) {
                                grid[xt + 1][yt] *= 2;
                                grid[xt][yt] = 0;
                                wasCreatedThisTurn[xt + 1][yt] = true;
                                break;
                            }

                            // If left has another value, stop
                            else {
                                break;
                            }
                        }
                    }
                }
            }
        }
        // up
        if (dir == 1) { 
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    if (grid[x][y] != 0) {
                        


                        int xt = x;
                        int yt = y;

                        while (yt > 0) {
                            // If left square is empty, move there.
                            if (yt - 1 >= 0 && grid[xt][yt - 1] == 0) {
                                grid[xt][yt - 1] = grid[xt][yt];
                                grid[xt][yt] = 0;
                                yt--;
                            }

                            // If left has same value, merge and stop.
                            else if (grid[xt][yt - 1] == grid[xt][yt] && !wasCreatedThisTurn[xt][yt - 1]) {
                                grid[xt][yt - 1] *= 2;
                                wasCreatedThisTurn[xt][yt - 1] = true;
                                grid[xt][yt] = 0;
                                break;
                            }

                            // If left has another value, stop
                            else {
                                break;
                            }
                        }
                    }
                }
            }
        }
        // down
        if (dir == 3) { 
            for (int x = 0; x < 4; x++) {
                for (int y = 3; y >= 0; y--) {
                    if (grid[x][y] != 0) {
                        int xt = x;
                        int yt = y;

                        while (yt < 3) {
                            if (yt + 1 >= 0 && grid[xt][yt + 1] == 0) {
                                grid[xt][yt + 1] = grid[xt][yt];
                                grid[xt][yt] = 0;
                                yt++;
                            }

                            else if (grid[xt][yt + 1] == grid[xt][yt] && !wasCreatedThisTurn[xt][yt + 1]) {
                                grid[xt][yt + 1] *= 2;
                                grid[xt][yt] = 0;
                                wasCreatedThisTurn[xt][yt + 1] = true;
                                break;
                            }

                            else {
                                break;
                            }
                        }
                    }
                }
            }
        }

        printGrid(grid);
    }

    public static void printGrid(int[][] grid) {
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                System.out.print(grid[x][y] + " ");
            }
            System.out.println("");
        }
    }
}
