import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

    @Test
    public void getFruit_ReturnFruit() {
        Apple myApple = new Apple("Green");
        assertEquals("Green", myApple.getFruit());
    }
}
