import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class baconeggsandspam {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            int customers = in.nextInt();
            if (customers == 0) {
                break;
            }
            HashMap<String, ArrayList<String>> foodOrderedBy = new HashMap<String, ArrayList<String>>();
            for (int i = 0; i < customers; i++) {
                String customer = in.next();
                String foodsOrdered = in.nextLine();
                String[] foodsOrderedList = foodsOrdered.split(" ");
                for (String food : foodsOrderedList) {
                    ArrayList<String> earlierFoodOrderedBy;
                    if (foodOrderedBy.containsKey(food)) {
                         earlierFoodOrderedBy = foodOrderedBy.get(food);
                    }
                    else {
                        earlierFoodOrderedBy = new ArrayList<>();
                    }
                    earlierFoodOrderedBy.add(customer);
                    foodOrderedBy.put(food, earlierFoodOrderedBy);
                }
            }
            foodOrderedBy.remove("");
            // System.out.println(foodOrderedBy);
            for (String key : foodOrderedBy.keySet()) {
                System.out.print(key);
                ArrayList<String> foodList = foodOrderedBy.get(key);
                Collections.sort(foodList);
                for (String food : foodList) {
                    System.out.print(" " + food);
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
