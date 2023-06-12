import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class cetiri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            nums.add(in.nextInt());
        }
        Collections.sort(nums);
        int result = 0;
        int d1 = nums.get(1) - nums.get(0);
        int d2 = nums.get(2) - nums.get(1);
        if (d1 == d2) {     //ex 2 4 6
            result = nums.get(2) + d2;
        }
        else if (d1 * 2 == d2) {    //ex 2 4 8
            result = nums.get(1) + d1;
        }
        else {  //ex 2 6 8
            result = nums.get(0) + d2;
        }
        System.out.println(result);
    }
}
