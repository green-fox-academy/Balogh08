import org.junit.Test;

import static org.junit.Assert.*;
public class AnimalTest {

    Animal dog = new Animal();

    @Test
    public void eat_DecreaseHunger_ReturnsHunger() {
        assertEquals(dog.hunger = 49, dog.eat(), 0);
    }

    @Test
    public void eat_DecreaseToNegative_ReturnsHunger() {
        dog.hunger = 0;
        dog.eat();
        assertTrue(dog.hunger == 0);
    }

    @Test
    public void eat_DecreaseManyTimes_ReturnsHunger() {
        dog.hunger = 3;
        dog.eat();
        dog.eat();
        dog.eat();
        dog.eat();
        dog.eat();
        dog.eat();

        assertTrue(dog.hunger == (0));
    }

    @Test
    public void drink_DecreaseHunger_ReturnsThirst() {
        assertEquals(dog.thirst = 49, dog.drink(), 0);
    }

    @Test
    public void drink_DecreaseToNegative_ReturnsThirst() {
        dog.thirst = 0;
        dog.drink();
        assertTrue(dog.thirst == 0);
    }

    @Test
    public void drink_DecreaseManyTimes_ReturnsThirst() {
        dog.thirst = 3;
        dog.drink();
        dog.drink();
        dog.drink();
        dog.drink();
        dog.drink();

        assertTrue(dog.thirst == (0));
    }
}
