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

        assertEquals(21,SumOfElements.sum(input));
    }

    @Test
    public void sum_NegativeValues_ReturnsNegativeNumber() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1, -2, -3, -4, -5, -6));
        assertEquals(-21,SumOfElements.sum(input));
    }

    @Test
    public void sum_RandomValues_ReturnsAmbiguousNumber() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, -2, 3, 4, -5, 6));
        assertEquals(7,SumOfElements.sum(input));
    }

    @Test
    public void sum_EmptyList_ReturnsNull() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList());
        assertEquals(0,SumOfElements.sum(input));
    }

    @Test
    public void sum_OneValue_ReturnsThatValue() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5));
        assertEquals(5,SumOfElements.sum(input));
    }

    @Test(expected = NullPointerException.class)
    public void sum_NullValue_ReturnsThatValue() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(null));
    }
}
