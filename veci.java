// open.kattis.com/problems/veci
// python3 submit.py veci.java
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

// This could probably more effectively have been solved by looking at all possible permutations
// of the digits, but since the number is smaller than 10000000, this should be fast enough too.
public class veci {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        String s1 = String.valueOf(n);

        for (int i = n + 1; i < 1000000; i++) {
            String s2 = String.valueOf(i);
            if (sameChars(s1, s2)) {
                System.out.println(s2);
                return;
            }
        }

        System.out.println("0");
    }

    private static boolean sameChars(String s1, String s2) {
        char[] ca1 = s1.toCharArray();
        char[] ca2 = s2.toCharArray();
        Arrays.sort(ca1);
        Arrays.sort(ca2);
        return Arrays.equals(ca1, ca2);
    }
}
