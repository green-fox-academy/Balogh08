package pirates;

public class BattleApp {
    public static void main(String[] args) {
        Ship firstShip = new Ship("Barcelona");
        Ship secondShip = new Ship("Real Madrid");

        firstShip.fillShip();
        firstShip.caption.name = "Messi";
        secondShip.fillShip();
        secondShip.caption.name = "Ramos";

        firstShip.randomParty();
        secondShip.randomParty();

        System.out.println(firstShip.caption.rumDrank);
        System.out.println(secondShip.caption.rumDrank);

        do {
            if (firstShip.crew.size() >= secondShip.crew.size()){
                secondShip.battle(firstShip);
            }
            else {
                firstShip.battle(secondShip);
            }
        } while (firstShip.crew.size() > 0 && secondShip.crew.size() > 0);

        firstShip.getStatus();
        secondShip.getStatus();
    }
}
