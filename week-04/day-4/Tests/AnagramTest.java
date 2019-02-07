import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void Compare_TwoSimilarWords_ReturnsTrue() {
        Anagram test = new Anagram();
        assertTrue(test.compare("dog", "god"));
    }

    @Test
    public void Compare_TwoDiffetentWords_ReturnsTrue() {
        Anagram test = new Anagram();
        assertFalse(test.compare("dog", "godiid"));
    }

    @Test
    public void Compare_NoWords_ReturnsTrue() {
        Anagram test = new Anagram();
        assertTrue(test.compare("",""));
    }
}
