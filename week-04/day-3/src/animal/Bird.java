package animal;

import flyable.Flyable;

public class Bird extends BreedsByEggs implements Flyable {


    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void land() {
        System.out.println("The " + getName() + ", " + age + " year old bird currently landing!" );
    }

    @Override
    public void fly() {
        System.out.println("The " + getName() + ", " + age + " year old bird currently flying!" );
    }

    @Override
    public void takeOff() {
        System.out.println("The " + getName() + ", " + age + " year old bird currently taking off!" );
    }
}
