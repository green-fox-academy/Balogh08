import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {

    Sharpie mySharpie = new Sharpie("black", 2.5);

    @Test
    public void use_DecreaseInkAmount_ReturnsInkAmount() {
        assertEquals(mySharpie.inkAmount = 99, mySharpie.use(), 0);
    }

    @Test
    public void use_DecreaseToNegative_ReturnsInkAmount() {
        mySharpie.inkAmount = 0;
        mySharpie.use();
        assertTrue(mySharpie.inkAmount == (0));
    }

    @Test
    public void use_DecreaseManyTimes_ReturnsInkAmount() {
        mySharpie.inkAmount = 3;
        mySharpie.use();
        mySharpie.use();
        mySharpie.use();
        mySharpie.use();
        mySharpie.use();
        mySharpie.use();
        mySharpie.use();
        mySharpie.use();
        assertTrue(mySharpie.inkAmount == (0));
    }



}
