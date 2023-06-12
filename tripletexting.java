// open.kattis.com/problems/tripletexting
import java.util.Scanner;

public class tripletexting {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String threeWords = in.next();
        int wordLen = threeWords.length()/3;
        String word1 = threeWords.substring(0, wordLen);
        String word2 = threeWords.substring(wordLen, 2 * wordLen);
        String word3 = threeWords.substring(2 * wordLen, 3 * wordLen);

        if (word1.equals(word2)) {
            System.out.println(word1);
        }
        else if (word1.equals(word3)) {
            System.out.println(word1);
        }
        else if (word2.equals(word3)){
            System.out.println(word2);
        }
        else {
            System.out.println(word3);
        }
    }
}
