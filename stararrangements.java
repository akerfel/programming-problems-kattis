import java.util.Scanner;

public class stararrangements {
    static int stars;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        stars = in.nextInt();
        for(int i = 0; i < stars; i++) {
            int firstRow = i;
            int secondRow = i;      //then do exactly same but this = i + 1
            int numFirstRow = 0;
            int numSecondRow = 0;
            while (firstRow * numFirstRow + secondRow * numSecondRow <= stars) {
                firstRow++;
                checkIfMatch(firstRow, secondRow, numFirstRow, numSecondRow);
                secondRow++;
                checkIfMatch(firstRow, secondRow, numFirstRow, numSecondRow);
            }
        }
    }

    public static void checkIfMatch(int firstRow, int secondRow,
        int numFirstRow, int numSecondRow) {
        if (firstRow * numFirstRow + secondRow * numSecondRow == stars) {
            System.out.println(firstRow + "," + secondRow);
        }
    }
}
