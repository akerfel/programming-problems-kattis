import java.util.Scanner;

public class numberfun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long cases = in.nextLong();
        for (int i = 0; i < cases; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if (check(a, b, c) || check(b, a, c)) {
                System.out.println("Possible");
            }
            else {
                System.out.println("Impossible");
            }
        }
    }
    public static boolean check(int a, int b, int c) {
        return(a + b == c || a - b == c ||(double) a / (double) b == (double) c || a * b == c);
    }
}