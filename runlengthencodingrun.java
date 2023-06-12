import java.util.Scanner;

public class runlengthencodingrun {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String task = in.next();
        if (task.equals("E")) {
            encode();
        }
        else if (task.equals("D")) {
            decode();
        }
    }

    public static void encode() {
        String input = in.next();
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            System.out.print(chars[i]);
            int count = 1;
            while (i < chars.length - 1 && chars[i] == chars[i+1]) {
                count++;
                i++;
            }
            System.out.print(count);
        }
    }

    public static void decode() {

    }
}