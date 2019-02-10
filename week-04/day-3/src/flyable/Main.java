package flyable;

public class Main {
    public static void main(String[] args) {
        Vehicle myHelicopter = new Helicopter("Tesla", "black" , 130);
        ((Helicopter)myHelicopter).fly();
        ((Helicopter) myHelicopter).land();
        ((Helicopter) myHelicopter).takeOff();

    }


}
