package pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {
    String name;
    List<Ship> listOfShips = new ArrayList<>();

    public Armada() {

    }

    public Armada(String name) {
        this.name = name;
    }

    public void fillArmada() {
        for (int i = 0; i < 100; i++) {
            Ship ships = new Ship("Ship " + (i + 1));
            ships.fillShip();
            listOfShips.add(ships);
        }
        System.out.println("Siez of " + name + ": " + listOfShips.size());
    }

    public boolean war(Armada otherArmada) {
        do {
            int firstShipOfArmada = 0;
            for (int i = firstShipOfArmada; i < listOfShips.size(); i++) {
                for (int j = 0; j < otherArmada.listOfShips.size(); j++) {
                    if (listOfShips.get(i).battle(otherArmada.listOfShips.get(j))) {
                        otherArmada.listOfShips.remove(j);
                    } else {
                        listOfShips.remove(i);
                        break;
                    }
                }
                break;
            }
        } while (listOfShips.size() > 0 && otherArmada.listOfShips.size() > 0);


        if (listOfShips.size() > otherArmada.listOfShips.size()) {
            System.out.println("Siez of " + name + ": " + listOfShips.size());
            System.out.println("Siez of " + otherArmada.name + ": " + otherArmada.listOfShips.size());
            return true;
        }
        else{
            System.out.println("Siez of " + name + ": " + listOfShips.size());
            System.out.println("Siez of " + otherArmada.name + ": " + otherArmada.listOfShips.size());
            return false;
        }
    }

    public void partyForArmada() {
        for (Ship ships : listOfShips
        ) {
            ships.randomParty();
        }
    }

    public void brawlOfArmada() {
        for (Ship ships : listOfShips
        ) {
            for (Pirate pirates: ships.crew
            ) {
                int randomFight = (int) (Math.random() * 10 + 1);
                int randomPartnerFromCrew = (int) (Math.random() * 10);
                if (randomFight > 5)
                    pirates.brawl(ships.crew.get(randomPartnerFromCrew));

            }
        }
    }
}
