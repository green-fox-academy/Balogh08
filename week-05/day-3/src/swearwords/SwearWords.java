package swearwords;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwearWords {
    public static void main(String[] args) {
        // There is a not so family friendly text in the `content.txt`
        // Create a function named familyFriendlizer that takes a filename and a list of strings as parameters
        // and remove all the given words from the file and returns the amount of the removed words.

        ArrayList<String> offensiveWords = new ArrayList<>(Arrays.asList("fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss"));
        System.out.println(familyFriendlizer("content.txt", offensiveWords)); // should print out 17
        System.out.println(familyFriendlizer2("content.txt", offensiveWords)); // should print out 17

    }

    public static int familyFriendlizer(String fileName, List<String> swearWords) {

        Path contentPath = Paths.get(fileName);
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(contentPath);
        } catch (IOException ex) {
            System.out.println("File cannot be read!");
        }

        int offensiveWordCounter = 0;

        for (String line : lines) {
            String[] words = line.toLowerCase().split("[\\W]");
            for (String word : words) {
                if (contains(word, swearWords)){
                    offensiveWordCounter++;
                }
            }
        }
        return offensiveWordCounter;
    }

    public static List<String> familyFriendlizer2(String fileName, List<String> swearWords) {

        Path contentPath = Paths.get(fileName);
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(contentPath);
        } catch (IOException ex) {
            System.out.println("File cannot be read!");
        }

        List<String> censoredText = new ArrayList<>();

        for (String line : lines) {
            String[] words = line.toLowerCase().split("[\\W]");
            for (String word : words) {
                if (!contains(word, swearWords)){
                    censoredText.add(word);
                }
            }
        }
        return censoredText;
    }

    public static boolean contains(String word, List<String> swearWords) {
        boolean result = false;

        for (String offensiveWord : swearWords) {
            if (word.equals(offensiveWord)) {
                result = true;
            }
        }
        return result;
    }
}
