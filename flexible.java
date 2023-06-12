// open.kattis.com/problems/flexible
// python3 submit.py flexible.java
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class flexible {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int w = in.nextInt();
        int p = in.nextInt();

        ArrayList<Integer> walls = new ArrayList<Integer>();
        walls.add(0);
        for (int i = 0; i < p; i++) {
            walls.add(in.nextInt());
        }
        walls.add(w);

        HashSet<Integer> widths = new HashSet<Integer>();
        for (int i = 0; i < walls.size(); i++) {
            for (int j = i + 1; j < walls.size(); j++) {
                widths.add(walls.get(j) - walls.get(i));
            }
        }
        
        // Sorting HashSet using List
        ArrayList<Integer> sortedWidths = new ArrayList<Integer>(widths);
        Collections.sort(sortedWidths);

        for (Integer width : sortedWidths) {
            System.out.print(width + " ");
        }
        System.out.println("");
    }
}
