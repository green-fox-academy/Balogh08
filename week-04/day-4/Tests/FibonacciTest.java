import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void fibonacci_positiveSmallNumber_RetrunFibonacciValue() {
        Fibonacci test = new Fibonacci();
        assertEquals(3,test.fibonacci(4));
    }

    @Test (expected = StackOverflowError.class)
    public void fibonacci_NegativeNumber_ThrowsStackOverflowError() {
        Fibonacci test = new Fibonacci();
        test.fibonacci(-5);
        System.err.println("fibonacci_NegativeNumber_ThrowsStackOverflowError called");
    }
}
