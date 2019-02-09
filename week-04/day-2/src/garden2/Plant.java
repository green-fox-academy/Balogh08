package garden2;

public class Plant {
    private String color;
    private double waterLevel;
    private boolean needsWater;
    private int minWater;
    private String className;
    private double absorbLevel;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setWaterLevel(double waterLevel) {
        this.waterLevel = waterLevel;
    }

    public double getWaterLevel(){
        return waterLevel;
    }

    public void setMinWater(int minWater) {
        this.minWater = minWater;
    }

    public int getMinWater() {
        return minWater;
    }

    public void setNeedsWaterTrue() {
        this.needsWater = true;
    }

    public void setNeedsWaterFalse() {
        this.needsWater = false;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setAbsorbLevel(double absorbLevel) {
        this.absorbLevel = absorbLevel;
    }

    public double getAbsorbLevel() {
        return absorbLevel;
    }

    public void needsPlantWater () {
        if (getWaterLevel() < getMinWater()) {
            setNeedsWaterTrue();
            System.out.println("The " + getColor() + " " + getClassName() + " needs water");
        }
        else {
            setNeedsWaterFalse();
            System.out.println("The " + getColor() + " " + getClassName() + " doesn't need water");
        }
    }
}
