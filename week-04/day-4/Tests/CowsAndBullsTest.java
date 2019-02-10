import org.junit.Test;

import static org.junit.Assert.*;
public class CowsAndBullsTest {

    CowsAndBulls randomNumbers = new CowsAndBulls();

    @Test
    public void randomNum_ReturnIntArray() {
        assertTrue(randomNumbers.randomNum().length == 4);
    }

    @Test
    public void randomNum_CheckOneByOne_ReturnEachValue() {
        assertTrue(randomNumbers.randomNum()[0] >= 0 && randomNumbers.randomNum()[0] < 10);
        assertTrue(randomNumbers.randomNum()[1] >= 0 && randomNumbers.randomNum()[0] < 10);
        assertTrue(randomNumbers.randomNum()[2] >= 0 && randomNumbers.randomNum()[0] < 10);
        assertTrue(randomNumbers.randomNum()[3] >= 0 && randomNumbers.randomNum()[0] < 10);
    }
}
