import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class fodelsedagsmemorisering {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<String, Tuple> dateToPerson = new HashMap<String, Tuple>();
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String name = in.next();
            int points = in.nextInt();
            String date = in.next();

            if (!dateToPerson.containsKey(date) || (dateToPerson.containsKey(date) && points > dateToPerson.get(date).points)) {
                dateToPerson.put(date, new Tuple(name, points));
            }
        }

        System.out.println(dateToPerson.size());

        ArrayList<String> sortedNames = new ArrayList<>();
        for (Tuple tuple : dateToPerson.values()) {
            sortedNames.add(tuple.name);
        }

        Collections.sort(sortedNames);
        for (String name : sortedNames) {
            System.out.println(name);
        }
    }
}

class Tuple {
    public String name;
    public int points;
    Tuple(String name, int points) {
        this.name = name;
        this.points = points;
    }
}
