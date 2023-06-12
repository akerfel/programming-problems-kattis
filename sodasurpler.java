import java.util.Scanner;

public class sodasurpler {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int e = in.nextInt();
        int f = in.nextInt();
        int c = in.nextInt();
        int empty = e + f;

        int bought = 0;

        while(empty >= c) {
            empty -= c;
            bought++;
            empty++;
        }

        System.out.println(bought);
    }

    /** Old
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int e = in.nextInt();
        int f = in.nextInt();
        int c = in.nextInt();
        int startEmpty = e + f;

        int bought = 0;

        while(true) {
            int buys = startEmpty / c;
            bought += buys;
            int extra = startEmpty % c;
            startEmpty = buys + extra;
            if (buys + extra < c) {
                break;
            }
        }

        System.out.println(bought);
    }
     */
}
