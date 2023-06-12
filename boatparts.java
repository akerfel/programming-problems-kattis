// open.kattis.com/problems/boatparts
import java.util.Scanner;
import java.util.HashSet;

public class boatparts {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int numParts = in.nextInt();
        int days = in.nextInt();

        HashSet<String> partsBought = new HashSet<String>();
        for (int day = 1; day <= days; day++) {
            partsBought.add(in.next());
            if (numParts == partsBought.size()) {
                System.out.println(day);
                return;
            }
        }
        System.out.println("paradox avoided");
    }
}
