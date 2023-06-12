// open.kattis.com/problems/bungeebuilder
// python3 submit.py bungeebuilder.java
import java.util.Scanner;

public class bungeebuilder {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = in.nextInt();
        }

        // For debug
        int a = -1;
        int b = -1;
        int shortest = -1;

        int maxJumpGlobal = 0;
        for (int i = 0; i < n - 2; i++) {

            if (heights[i+1] > heights[i]) {
                continue;
            }
            // Looking at gap between mountain i and j
            int shortestMountainInGap = heights[i+1];
            for (int j = i + 2; j < n; j++) {
                int maxJumpThisGap = Math.min(heights[i], heights[j]) - shortestMountainInGap;
                if (maxJumpThisGap > maxJumpGlobal) {
                    maxJumpGlobal = maxJumpThisGap;
                    a = i;
                    b = j;
                    shortest = shortestMountainInGap;
                }

                if (heights[j] < shortestMountainInGap) {
                    shortestMountainInGap = heights[j];
                }

                if (heights[j] > heights[i]) { // no other mountains can be reached
                    break;
                }
            }
        }
        System.out.println(maxJumpGlobal);
        //System.out.println("a: " + a);
        //System.out.println("b: " + b);
        //System.out.println("shortest: " + shortest);
    }
}
