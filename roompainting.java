// open.kattis.com/problems/roompainting
// python3 submit.py roompainting.java
import java.util.Scanner;
import java.util.Arrays;

public class roompainting {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int numSizes = in.nextInt();
        int numNeededSizes = in.nextInt();

        int[] sizes = new int[numSizes];
        for (int i = 0; i < sizes.length; i++) {
            sizes[i] = in.nextInt();
        }
        Arrays.sort(sizes); // In preperation for binary search
 
        int totalWasted = 0;
        for (int i = 0; i < numNeededSizes; i++) {
            int neededSize = in.nextInt();

            long smallestWaste = -1;
            for (int j = 0; j < sizes.length; j++) {

                if (sizes[j] >= neededSize && (sizes[j] - neededSize < smallestWaste || smallestWaste == -1)) {
                    smallestWaste = sizes[j] - neededSize;
                    if (smallestWaste == 0) {
                        break;
                    }
                }
            }
            totalWasted += smallestWaste;
        }
        System.out.println(totalWasted);
    }
}