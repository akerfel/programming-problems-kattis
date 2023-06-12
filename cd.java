// open.kattis.com/problems/cd
// python3 submit.py cd.java
import java.util.Scanner;
import java.util.HashSet;

public class cd {
    static Scanner in = new Scanner(System.in);
     public static void main(String[] args) {
        while (true) {
            int jackNumCDs = in.nextInt();
            int jillNumCDs = in.nextInt();
            if (jackNumCDs == 0 && jillNumCDs == 0) {
                return;
            }

            HashSet<Integer> jackCDs = new HashSet<Integer>();
            for (int i = 0; i < jackNumCDs; i++) {
                jackCDs.add(in.nextInt());
            }
            HashSet<Integer> jillCDs = new HashSet<Integer>();
            for (int i = 0; i < jillNumCDs; i++) {
                jillCDs.add(in.nextInt());
            }

            // Get the intersection between the two sets
            jackCDs.retainAll(jillCDs);

            System.out.println(jackCDs.size());
        }
    }
}
