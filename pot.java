import java.util.Scanner;

public class pot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            int num = in.nextInt();
            int exp = num % 10;
            int base = num / 10;
            sum += Math.pow(base, exp);
        }
        System.out.println(sum);
    }
}
