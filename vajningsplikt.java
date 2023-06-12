// open.kattis.com/problems/vajningsplikt
// python3 submit.py vajningsplikt.java
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class vajningsplikt {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String fromStr = in.next();
        String toStr = in.next();
        String otherStr = in.next();

        ArrayList<String> dirs = new ArrayList<String>();
        dirs.add("North");
        dirs.add("East");
        dirs.add("South");
        dirs.add("West");

        int from = dirs.indexOf(fromStr);
        int to = dirs.indexOf(toStr);
        int other = dirs.indexOf(otherStr);

        // Du ska rakt genom korsningen och ett annat fordon kommer från höger.
        if (Math.abs(from - to) == 2 && (from - other == 1 || from - other == -3)) {
            System.out.println("Yes");
            return;
        }

        // Du ska svänga vänster i korsningen och 
        // ett annat fordon kommer från motsatt riktning eller från höger.
        if ((to - from == 1 || to - from == -3) && (Math.abs(other - from) == 2 || (from - other == 1 || from - other == -3))) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");
    }
}
