import java.util.Scanner;

public class drmmessages {
    private static final String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String code = in.next();

        String left = code.substring(0, code.length()/2);
        String right = code.substring(code.length()/2, code.length());

        int valOfCharsLeft = getValOfChars(left);
        int valOfCharsRight = getValOfChars(right);

        String rotatedLeft = rotateString(left, valOfCharsLeft);
        String rotatedRight = rotateString(right, valOfCharsRight);

        String mergedStrings = merge(rotatedLeft, rotatedRight);
        System.out.println(mergedStrings);
    }

    static String merge(String left, String right) {
        String mergedString = "";
        for (int i = 0; i < left.length(); i++) {
            int steps = alpha.indexOf(right.charAt(i));
            int indexOrginialLetter = alpha.indexOf(left.charAt(i));
            indexOrginialLetter += steps;
            while (indexOrginialLetter > 25) {
                indexOrginialLetter -= 26;
            }
            mergedString += alpha.charAt(indexOrginialLetter);
        }
        return mergedString;
    }

    static String rotateString(String string, int steps) {
        String rotatedString = "";
        for (int i = 0; i < string.length(); i++) {
            int indexOrginialLetter = alpha.indexOf(string.charAt(i));
            indexOrginialLetter += steps;
            while (indexOrginialLetter > 25) {
                indexOrginialLetter -= 26;
            }
            rotatedString += alpha.charAt(indexOrginialLetter);
        }
        return rotatedString;
    }

    static int getValOfChars(String word) {
        int value = 0;
        for (int i = 0; i < word.length(); i++) {
            value += word.charAt(i) - 65;
        }
        return value;
    }
}
