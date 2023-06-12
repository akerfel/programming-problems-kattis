import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class synchronizinglists {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        while (in.hasNext()) {
            solve();
        }
    }

    public static void solve() {
        int numElements = in.nextInt();
        if (numElements == 0) {
            return;
        }

        ArrayList<Integer> firstList = new ArrayList<>();
        for (int i = 0; i < numElements; i++) {
            firstList.add(in.nextInt());
        }
        ArrayList<Integer> secondList = new ArrayList<>();
        for (int i = 0; i < numElements; i++) {
            secondList.add(in.nextInt());
        }

        ArrayList<Integer> sortedFirstList = new ArrayList<Integer>(firstList);
        Collections.sort(sortedFirstList);
        ArrayList<Integer> sortedSecondList = new ArrayList<Integer>(secondList);
        Collections.sort(sortedSecondList);

        ArrayList<Integer> correctSecondList = new ArrayList<>();

        for (int i = 0; i < sortedFirstList.size(); i++) {
            int currentElemInFirstList = firstList.get(i);
            int indexInSortedFirstList = sortedFirstList.indexOf(currentElemInFirstList);
            correctSecondList.add(sortedSecondList.get(indexInSortedFirstList));
        }

        for (int i = 0; i < correctSecondList.size(); i++) {
            System.out.println(correctSecondList.get(i));
        }
        System.out.println("");
    }

}