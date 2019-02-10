package flyable;

public class Helicopter extends Vehicle implements Flyable {

    public Helicopter(String brand, String color, int speed) {
        super(brand, color, speed);
    }


    @Override
    public void land() {
        System.out.println("The " + getBrand() + ", " + getColor() + " helicopter currently landing with the speed of " + getSpeed() + "!" );
    }

    @Override
    public void fly() {
        System.out.println("The " + getBrand() + ", " + getColor() + " helicopter currently flying with the speed of " + getSpeed() + "!" );
    }

    @Override
    public void takeOff() {
        System.out.println("The " + getBrand() + ", " + getColor() + " helicopter currently taking off with the speed of " + getSpeed() + "!" );
    }
}
