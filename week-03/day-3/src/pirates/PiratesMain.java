package pirates;

public class PiratesMain {
    public static void main(String[] args) {

        Ship firstShip = new Ship("Barcelona");
        Ship secondShip = new Ship("Real Madrid");

        firstShip.fillShip();
        firstShip.caption.name = "Messi";
        secondShip.fillShip();
        secondShip.caption.name = "Ramos";

        firstShip.randomParty();
        secondShip.randomParty();
        System.out.println(firstShip.battle(secondShip));;

        firstShip.getStatus();
        secondShip.getStatus();

        System.out.println(secondShip.battle(firstShip));;


        Armada armada = new Armada("The Armada");
        armada.fillArmada();




    }
}
