import java.util.Scanner;

public class freefood {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int events = in.nextInt();
        boolean[] foodDays = new boolean[365];
        for (int i = 0; i < events; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            for (int j = start - 1; j < end; j++) {
                foodDays[j] = true;
            }
        }
        int totalFoodDays = 0;
        for (int i = 0; i < foodDays.length; i++) {
            if (foodDays[i] == true) {
                totalFoodDays++;
            }
        }
        System.out.println(totalFoodDays);
    }
}
