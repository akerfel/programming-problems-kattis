// open.kattis.com/problems/whatdoesthefoxsay
// python3 submit.py whatdoesthefoxsay.java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class whatdoesthefoxsay {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        in.nextLine();  // Get to start of next line
        for (int i = 0; i < n; i++) {
            String recordingString = in.nextLine();
            String[] recording = recordingString.split("\\s");

            // Add all animal sounds to HashSet
            HashSet<String> animalSounds = new HashSet<String>();
            while (true) {
                in.next();
                in.next();
                String sound = in.next(); // Should be nextLine() if sounds can be multiple words
                if (sound.equals("the")) {
                    break;
                }
                animalSounds.add(sound);
            }

            // Only print fox sounds
            for (String recordedWord : recording) {
                if (!animalSounds.contains(recordedWord)) {
                    System.out.print(recordedWord + " ");
                }
            }
            System.out.println("");
            in.nextLine();  // Get to start of next line
        }
    }
}
