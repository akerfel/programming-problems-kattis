import java.util.Scanner;
import java.util.HashSet;

public class oddmanout {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int cases = in.nextInt();
        for (int i = 0; i < cases; i++) {
            HashSet<Integer> codesAdded = new HashSet<Integer>();
            int guests = in.nextInt();
            for (int j = 0; j < guests; j++) {
                int code = in.nextInt();
                if (codesAdded.contains(code)) {
                    codesAdded.remove(code);
                }
                else {
                    codesAdded.add(code);
                }
            }
            int onlyOneLeft = codesAdded.iterator().next();
            System.out.println("Case #" + (i+1) + ": " + onlyOneLeft);
        }
    }
}
