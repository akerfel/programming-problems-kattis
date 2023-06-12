import java.util.ArrayList;
import java.util.Scanner;

public class modulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> detectedRemainders = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = in.nextInt();
            int remainder = num % 42;
            if (!detectedRemainders.contains(remainder)) {
                detectedRemainders.add(remainder);
            }
        }
        System.out.println(detectedRemainders.size());
    }
}
