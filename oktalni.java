// open.kattis.com/problems/oktalni
// python3 submit.py oktalni.java
import java.util.Scanner;

public class oktalni {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String binary = in.next();
        int numBits = binary.length();

        // Pad binary until length divisible by three
        switch (numBits % 3) {
            case 1:
                binary = "00" + binary;
                break;
            case 2:
                binary = "0" + binary;
        }

        // Group adjacent binary digits into groups of 3 digits
        int numGroups = binary.length() / 3;
        String octoString = "";
        for (int i = 0; i < numGroups; i++) {
            int currentOcto = 0;
            if (binary.charAt(i * 3) == '1') {
                currentOcto += 4;
            }
            if (binary.charAt(i * 3 + 1) == '1') {
                currentOcto += 2;
            }
            if (binary.charAt(i * 3 + 2) == '1') {
                currentOcto += 1;
            }
            octoString += Integer.toString(currentOcto);
        }
        System.out.println(octoString);
    }
}
