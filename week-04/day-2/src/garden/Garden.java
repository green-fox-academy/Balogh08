package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    public static void main(String[] args) {
        Flower flower1 = new Flower("yellow");
        Flower flower2 = new Flower("blue");

        Tree tree1 = new Tree("purple");
        Tree tree2 = new Tree("orange");

        List<Plant> gardenPlants = new ArrayList<>();
        gardenPlants.add(flower1);
        gardenPlants.add(flower2);
        gardenPlants.add(tree1);
        gardenPlants.add(tree2);

        showGarden(gardenPlants);
        waterPlants(gardenPlants);
    }



    public static void showGarden(List<Plant> name) {
        for (Plant plant : name) {
            plant.checkWater();
        }
        System.out.println("");
    }

    public static void waterPlants(List<Plant> name) {
        List<Plant> plantsToWater = new ArrayList<>();
        int pourWater = 40;


        for (int i = 0; i < 2; i++) {
            for (Plant plant : name) {
                if (plant.isWater) {
                    plantsToWater.add(plant);
                }
            }

            for (Plant plant : plantsToWater) {
                if (plant.typeOfPlant.equals("Flower"))
                    plant.water += 0.75 * (pourWater/plantsToWater.size());
                else {
                    plant.water += 0.4 * (pourWater/plantsToWater.size());
                }
            }


            System.out.println("Watering with " + pourWater);
            showGarden(name);
            pourWater += 30;
        }
    }
}
