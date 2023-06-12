import java.util.Scanner;

public class jobexpenses {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int sumExpenses = 0;
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (num < 0) {
                sumExpenses -= num;
            }
        }
        System.out.println(sumExpenses);
    }
}
