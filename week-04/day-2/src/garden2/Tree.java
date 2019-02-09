package garden2;

public class Tree extends Plant {

    public Tree(String color) {
        setColor(color);
        setWaterLevel(0);
        setMinWater(10);
        setClassName("Tree");
        setAbsorbLevel(0.4);
    }
}
