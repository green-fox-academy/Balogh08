package garden2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();

        Flower blue = new Flower("blue");
        Flower yellow = new Flower("yellow");
        Tree purple = new Tree("purple");
        Tree orange = new Tree("orange");

        garden.add(yellow);
        garden.add(blue);
        garden.add(purple);
        garden.add(orange);

        garden.gardenWaterLevel();

        garden.waterPlant();

    }
}
