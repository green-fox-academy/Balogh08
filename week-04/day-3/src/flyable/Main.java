package flyable;

import animal.Bird;

public class Main {
    public static void main(String[] args) {
        Vehicle myHelicopter = new Helicopter("Tesla", "black" , 130);
        ((Helicopter)myHelicopter).fly();
        ((Helicopter) myHelicopter).land();
        ((Helicopter) myHelicopter).takeOff();

        Bird myBird = new Bird("madár", 5);
        myBird.takeOff();

    }


}
