// open.kattis.com/problems/bookingaroom
import java.util.Scanner;

public class bookingaroom {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int numRooms = in.nextInt();
        int numAlreadyBooked = in.nextInt();

        if (numRooms == numAlreadyBooked) {
            System.out.println("too late");
            return;
        }

        boolean[] alreadyBooked = new boolean[numRooms+1];
        for (int i = 0; i < numAlreadyBooked; i++) {
            alreadyBooked[in.nextInt()] = true;
        }
        for (int i = 1; i < alreadyBooked.length; i++) {
            if (!alreadyBooked[i]) {
                System.out.println(i);
                return;
            }
        }
    }
}
