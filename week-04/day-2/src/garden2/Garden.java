package garden2;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    List<Plant> garden;

    public Garden() {
        garden = new ArrayList<>();
    }

    public void add(Plant plant) {
        garden.add(plant);
    }

    public void gardenWaterLevel() {
        for (Plant plants : garden) {
            plants.needsPlantWater();
        }
        System.out.println("");
    }

    public void waterPlant() {
        List<Plant> toWater = new ArrayList<>();
        int amountOfWater;
        for (int i = 0; i < 2; i++) {

            if (i == 0) {
                amountOfWater = 40;
            } else {
                amountOfWater = 70;
            }

            for (Plant plants : garden) {
                if (plants.getWaterLevel() < plants.getMinWater()) {
                    toWater.add(plants);
                }
            }

            double amountOfWaterPerPlant = amountOfWater / toWater.size();
            for (Plant plants : toWater) {
                plants.setWaterLevel(plants.getWaterLevel() + (amountOfWaterPerPlant * plants.getAbsorbLevel()));
            }
            System.out.println("Watering with " + amountOfWater);
            gardenWaterLevel();
        }
    }
}
