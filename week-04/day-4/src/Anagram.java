import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    public boolean compare(String firstWord, String secondWord){
        boolean isSimilar = false;

        if (firstWord.length() != secondWord.length()) {
            return isSimilar;
        }
        char[] firstWordChar = firstWord.toLowerCase().toCharArray();
        Arrays.sort(firstWordChar);
        char[] secondWordChar = secondWord.toLowerCase().toCharArray();
        Arrays.sort(secondWordChar);

        if (new String(firstWordChar).equals(new String(secondWordChar))) {
            isSimilar = true;
        }
        return isSimilar;
    }
}
