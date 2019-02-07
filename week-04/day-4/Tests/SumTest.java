import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class SumTest {

    @Test
    public void Sum_FewElements_ReturnsSumOfElements() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("Hello", "Wie gehts?", "How are you?"));
        Sum elements = new Sum(input);
        assertEquals(3, elements.sum());
    }

    @Test
    public void Sum_NullElements_ReturnsSumOfElements() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList());
        Sum elements = new Sum(input);
        assertEquals(0, elements.sum());
    }

    @Test
    public void Sum_NotStringElements_ReturnsSumOfElements() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList());
        Sum elements = new Sum(input);
        assertEquals(0, elements.sum());
    }
}
