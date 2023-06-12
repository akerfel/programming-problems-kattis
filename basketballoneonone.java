// open.kattis.com/problems/basketballoneonone
// python3 submit.py basketballoneonone.java
import java.util.Scanner;

public class basketballoneonone {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int scoreA = 0;
        int scoreB = 0;
        boolean winBy2 = false;

        String input = in.next();

        for (int i = 0; i < input.length(); i += 2) {
            char person = input.charAt(i);
            int points = Character.getNumericValue(input.charAt(i + 1));
            if (person == 'A') {
                scoreA += points;
            }
            else {
                scoreB += points;
            }

            if (scoreA == 10 && scoreB == 10) {
                winBy2 = true;
            }

            if (!winBy2 && scoreA >= 11) {
                System.out.println("A");
                return;
            }

            if (!winBy2 && scoreB >= 11) {
                System.out.println("B");
                return;
            }


            if (winBy2) {
                if (scoreA - scoreB >= 2) {
                    System.out.println("A");
                    return;
                }
                if (scoreB - scoreA >= 2) {
                    System.out.println("B");
                    return;
                } 
            }
        }
    }
}
