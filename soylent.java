import java.util.Scanner;

public class soylent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int neededSoy = 1;
            int neededCal = in.nextInt();
            if (neededCal == 0) {
                System.out.println(0);
            }
            else {
                while (neededCal > 400) {
                    neededCal -= 400;
                    neededSoy++;
                }
                System.out.println(neededSoy);
            }
        }
    }
}
