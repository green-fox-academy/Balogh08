import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumOfElementsTest {


    @Test
    public void Sum_PositiveValues_ReturnsPositivNumber() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        SumOfElements elements = new SumOfElements(input);
        assertEquals(21,elements.Sum());
    }

    @Test
    public void Sum_NegativeValues_ReturnsNegativeNumber() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1, -2, -3, -4, -5, -6));
        SumOfElements elements = new SumOfElements(input);
        assertEquals(-21,elements.Sum());
    }

    @Test
    public void Sum_RandomValues_ReturnsAmbiguousNumber() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, -2, 3, 4, -5, 6));
        SumOfElements elements = new SumOfElements(input);
        assertEquals(7,elements.Sum());
    }

    @Test
    public void Sum_NullValue_ReturnsNull() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList());
        SumOfElements elements = new SumOfElements(input);
        assertEquals(0,elements.Sum());
    }
}
