package pirates;

public class PiratesMain {
    public static void main(String[] args) {
        Pirate pirate1 = new Pirate("pirate1", 0);
        Pirate pirate2 = new Pirate("pirate2", 2);
        Pirate pirate3 = new Pirate("pirate3", 0);

        pirate1.drinkSomeRum(5);
        pirate1.drinkSomeRum(5);
        pirate1.setParrot();
        System.out.println(pirate1.parrot);

        pirate1.howsItGoingMate();

        pirate2.drinkSomeRum(2);
        System.out.println(pirate2.rumDrank);

        System.out.println(pirate3.rumDrank);
        pirate1.brawl(pirate2);

    }
}
