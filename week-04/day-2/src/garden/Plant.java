package garden;

public class Plant {
    String color;
    double water;
    boolean isWater;
    String typeOfPlant;
    int waterAmount;

    public Plant(String color, int waterAmount) {
        this.color = color;
        this.waterAmount = waterAmount;
        isWater = false;
    }


    public void checkWater() {
        if(water < waterAmount){
            isWater = true;
            System.out.println("The " + color + " " + typeOfPlant + " needs water!");
        } else{
            isWater = false;
            System.out.println("The " + color + " " + typeOfPlant + " does not need water!");
        }
    }
}
