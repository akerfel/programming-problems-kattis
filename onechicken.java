// open.kattis.com/problems/onechicken
// python3 submit.py onechicken.java
import java.util.Scanner;

public class onechicken {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int people = in.nextInt();
        int provided = in.nextInt();

        if (people < provided) {
            int leftOvers = provided - people;
            if (leftOvers == 1) {
                System.out.println("Dr. Chaz will have 1 piece of chicken left over!");
            }
            else {
                System.out.println("Dr. Chaz will have " + leftOvers + " pieces of chicken left over!");
            }
        }
        else {
            int needed = people - provided;
            if (needed == 1) {
                System.out.println("Dr. Chaz needs 1 more piece of chicken!");
            }
            else {
                System.out.println("Dr. Chaz needs " + needed + " more pieces of chicken!");
            }
        }
    }
}
