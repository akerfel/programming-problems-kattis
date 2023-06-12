import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class blackfriday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> rolls = new ArrayList<Integer>();
        HashMap<Integer, Integer> uniques = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int newRoll = in.nextInt();
            rolls.add(newRoll);
            uniques.put(newRoll, i);
        }
        for (int i = 0; i < n; i++) {
            int roll = rolls.get(i);
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    if (roll == rolls.get(j)) {
                        uniques.remove(roll);
                    }
                }
            }
        }
        if (uniques.size() == 0) {
            System.out.println("none");
        }
        else {
            int highestRoll = 1;
            Iterator<Integer> it = uniques.keySet().iterator();
            while(it.hasNext()) {
                int roll = it.next();
                if (roll > highestRoll) {
                    highestRoll = roll;
                }
            }
            System.out.println(uniques.get(highestRoll) + 1);
        }
    }
}
