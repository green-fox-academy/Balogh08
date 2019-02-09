package garden;

public class Flower extends Plant {

    public Flower(String color) {
        super(color, 5);
        this.water = 3;
        typeOfPlant = "flower";
    }
}
