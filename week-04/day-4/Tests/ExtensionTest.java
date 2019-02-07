import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Arrays;

public class ExtensionTest {

    Extension extension = new Extension();

    @Test
    public void testAdd_2and3is5() {
        assertEquals(5, extension.add(2, 3));
    }

    @Test
    public void testAdd_0and0is0() {
        assertEquals(0, extension.add(0, 0));
    }

    @Test
    public void testAdd_Minus10and10is0() {
        assertEquals(0, extension.add(-10, 10));
    }

    @Test
    public void testAdd_1and4is5() {
        assertEquals(5, extension.add(1, 4));
    }

    @Test
    public void testMaxOfThree_first() {
        assertEquals(5, extension.maxOfThree(5, 4, 3));
    }

    @Test
    public void testMaxOfThree_second() {
        assertEquals(3, extension.maxOfThree(4, 4, 3));
    }

    @Test
    public void testMaxOfThree_third() {
        assertEquals(5, extension.maxOfThree(3, 4, 5));
    }

    @Test
    public void testMedian_four() {
        assertEquals(5, extension.median(Arrays.asList(7,5,3,5)));
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testMedian_zero() {
        assertEquals(5, extension.median(Arrays.asList()));
    }

    @Test
    public void testMedian_five() {
        assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
    }

    @Test
    public void testIsVowel_a() {
        assertTrue(extension.isVowel('a'));
    }

    @Test
    public void testIsVowel_u() {
        assertTrue(extension.isVowel('u'));
    }

    @Test
    public void testIsVowel_A() {
        assertTrue(extension.isVowel('A'));
    }

    @Test
    public void testTranslate_bemutatkozik() {
        assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
    }

    @Test
    public void testTranslate_lagopus() {
        assertEquals("lavagovopuvus", extension.translate("lagopus"));
    }

    @Test
    public void testTranslate_teve() {
        assertEquals("teve", extension.translate("te"));
    }

    @Test
    public void testTranslate_la() {
        assertEquals("lavalava", extension.translate("lala"));
    }
}