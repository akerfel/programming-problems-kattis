import java.util.*;

public class cups {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int numCups = in.nextInt();
        in.nextLine();
        HashMap<Integer, String> radiusToColor = new HashMap<Integer, String>();
        for (int i = 0; i < numCups; i++) {
            String[] strs = in.nextLine().split(" ");
            int radius;
            String color;
            if (isInteger(strs[0])) {
                radius = Integer.parseInt(strs[0]) / 2;
                color = strs[1];
            }
            else {
                radius = Integer.parseInt(strs[1]);
                color = strs[0];
            }
            radiusToColor.put(radius, color);
        }
        ArrayList<Integer> radiuses = new ArrayList<>(radiusToColor.keySet());
        Collections.sort(radiuses);
        for (int radius : radiuses) {
            System.out.println(radiusToColor.get(radius));
        }

    }
    public static boolean isInteger(String s) {
        return isInteger(s,10);
    }

    public static boolean isInteger(String s, int radix) {
        if(s.isEmpty()) return false;
        for(int i = 0; i < s.length(); i++) {
            if(i == 0 && s.charAt(i) == '-') {
                if(s.length() == 1) return false;
                else continue;
            }
            if(Character.digit(s.charAt(i),radix) < 0) return false;
        }
        return true;
    }
}
