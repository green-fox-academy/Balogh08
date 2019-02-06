package pirates;

public class Main {
    public static void main(String[] args) {
        Pirate pirate1 = new Pirate("Boti", 0);
        pirate1.work();

        Ship firstShip = new Ship("Titanic");
        firstShip.fillShip(10,0);

        for (Pirate pirates : firstShip.crew
             ) {
            System.out.println(pirates.name);
        }
        firstShip.fillShip(10,20);
        for (Pirate pirates : firstShip.crew
        ) {
            System.out.println(pirates.name);
        }

        for (int i = 0; i < firstShip.getPoorPirates().size(); i++) {
            System.out.println("Poor pirates: " + firstShip.getPoorPirates().get(i));
        }
        System.out.println(firstShip.getGolds());

        firstShip.prepareForBattle();

        for (Pirate pirates : firstShip.crew
        ) {
            System.out.println(pirates.name);
        }
        for (int i = 0; i < firstShip.getPoorPirates().size(); i++) {
            System.out.println("Poor pirates: " + firstShip.getPoorPirates().get(i));
        }

    }
}
