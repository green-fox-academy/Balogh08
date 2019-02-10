package flyable;

public abstract class Vehicle {
    private String brand;
    private String color;
    private int speed;

    public Vehicle(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public String getBrand() {
        return brand;
    }
}
