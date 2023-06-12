import java.util.HashMap;
import java.util.Scanner;

public class chopin {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<String, String> sharpAlts = new HashMap<String, String>();
        sharpAlts.put("A#", "Bb");
        sharpAlts.put("C#", "Db");
        sharpAlts.put("D#", "Eb");
        sharpAlts.put("F#", "Gb");
        sharpAlts.put("G#", "Ab");

        HashMap<String, String> bAlts = new HashMap<String, String>();
        bAlts.put("Bb", "A#");
        bAlts.put("Db", "C#");
        bAlts.put("Eb", "D#");
        bAlts.put("Gb", "F#");
        bAlts.put("Ab", "G#");
        
        int i = 1;
        while (in.hasNext()) {
            String note = in.next();
            String minorOrMajor = in.next();
            String altNote = "";
            String result;
            if (sharpAlts.keySet().contains(note)) {
                altNote = sharpAlts.get(note);
                System.out.println("Case " + i + ": " + altNote + " " + minorOrMajor);
            }
            else if (bAlts.keySet().contains(note)) {
                altNote = bAlts.get(note);
                System.out.println("Case " + i + ": " + altNote + " " + minorOrMajor);
            }
            else {
                System.out.println("Case " + i + ": UNIQUE");
            }
            i++;
        }
    }
}
