// open.kattis.com/problems/reverserot
import java.util.Scanner;

public class reverserot {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String order = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
        int shift = in.nextInt();
        while (shift != 0) {
            String code = in.next();
            String shifted = "";
            for (int i = 0; i < code.length(); i++) {
                int indexOfCharToShift = order.indexOf(code.charAt(i));
                int indexOfCharToAdd = (indexOfCharToShift + shift) % 28;
                shifted += order.charAt(indexOfCharToAdd);
            }
            String reversed = reverseString(shifted);
            System.out.println(reversed);
            shift = in.nextInt();
        }
    }

    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
