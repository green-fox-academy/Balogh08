import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountLetters {

    public Map countLetters(String yourWord) {

        if (yourWord == null) {
            throw new NullPointerException();
        }

        Map<Character, Integer> dictionary = new HashMap<>();
        char[] charOfWord = yourWord.toCharArray();
        Arrays.sort(charOfWord);

        for (char characters: charOfWord
        ) {
            if (dictionary.containsKey(characters)) {
                int amount = dictionary.get(characters);
                dictionary.put(characters, amount += 1);
            }
            else if (!dictionary.containsKey(characters)) {
                dictionary.put(characters, 1);
            }
        }
        return dictionary;
    }
}
