import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountLettersTest {

    @Test
    public void countLetters_LongWord_ReturnSortedDictionary() {
        CountLetters dictionary = new CountLetters();
        String word = "Balogh Botond";
        Map<Character, Integer> testMap = new HashMap<>();
        testMap.put(' ', 1);
        testMap.put('a', 1);
        testMap.put('B', 2);
        testMap.put('d', 1);
        testMap.put('t', 1);
        testMap.put('g', 1);
        testMap.put('h', 1);
        testMap.put('l', 1);
        testMap.put('n', 1);
        testMap.put('o', 3);
        assertEquals(testMap, dictionary.countLetters(word));
    }

    @Test
    public void countLetters_NoWord_ReturnEmptyHashMap() {
        CountLetters dictionary = new CountLetters();
        String word = "";
        Map<Character, Integer> testMap = new HashMap<>();
        assertEquals(testMap, dictionary.countLetters(word));
    }

    @Test (expected = NullPointerException.class)
    public void countLetters_Null_ReturnException() {
        CountLetters dictionary = new CountLetters();
        String word = null;
        Map<Character, Integer> testMap = new HashMap<>();
        assertEquals(testMap, dictionary.countLetters(word));
    }
}
