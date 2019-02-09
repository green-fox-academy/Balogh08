package garden2;

public class Flower extends Plant {

    public Flower(String color) {
        setColor(color);
        setWaterLevel(3);
        setMinWater(5);
        setClassName("Flower");
        setAbsorbLevel(0.75);
    }
}
