// open.kattis.com/problems/fallingapart
// python3 submit.py fallingapart.java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class fallingapart {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        int a = 0;
        int b = 0;

        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            nums.add(in.nextInt());
        }

        boolean alicesTurn = true;
        while (nums.size() != 0) {
            int maxValue = Collections.max(nums);
            int indexOfMax = nums.indexOf(maxValue);
            nums.remove(indexOfMax);
            if (alicesTurn) {
                a += maxValue;
                alicesTurn = false;
            }
            else {
                b += maxValue;
                alicesTurn = true;
            }
        }

        System.out.println(a + " " + b);
    }
}
