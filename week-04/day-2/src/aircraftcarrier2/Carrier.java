package aircraftcarrier2;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    List<Aircraft> carrier;
    int stockOfAmmo;
    int healthPoint;
    int counter;

    public Carrier() {

    }

    public Carrier(int stockOfAmmo, int healthPoint){
        carrier = new ArrayList<>();
        this.stockOfAmmo = stockOfAmmo;
        this.healthPoint = healthPoint;
        counter = 0;
    }

    public void add(String aircraftType) {
        counter++;
        Aircraft repulo;
        if (aircraftType.equals("F16")) {
            repulo = new F16();
            carrier.add(repulo);
        } else if (aircraftType.equals("F35")) {
            repulo = new F35();
            carrier.add(repulo);
        } else {
            System.out.println("Aircraft type does not exist.");
        }

    }

    public void fill() {
        if (stockOfAmmo <= 0) {
            throw new StringIndexOutOfBoundsException("Out of ammo!");
        }

        List<Aircraft> priorityAircraft = new ArrayList<>();
        List<Aircraft> secondaryAircraft = new ArrayList<>();
        for (Aircraft airplane : carrier) {
            if (airplane.getType().equals("F35")) {
                priorityAircraft.add(airplane);
            } else {
                secondaryAircraft.add(airplane);
            }
        }

        for (Aircraft airplane : priorityAircraft) {
            stockOfAmmo = airplane.refill(stockOfAmmo);
        }

        for (Aircraft airplane : secondaryAircraft) {
            stockOfAmmo = airplane.refill(stockOfAmmo);
        }
    }

    public void fight(Carrier otherCarrier) {
        int sumDamage = 0;
        for (Aircraft airplane: carrier) {
            sumDamage += airplane.fight();
        }
        otherCarrier.healthPoint -= sumDamage;
    }

    public String getStatus() {
        String status = "";
        int sumDamage = 0;
        String airplaneEachByEach = "";

        if (healthPoint > 0) {
            for (Aircraft airplane : carrier) {
                sumDamage += (airplane.getAmmoCurrent() * airplane.getBaseDamage());
                airplaneEachByEach += airplane.getStatus() + "\n";
            }
            status = "HP: " + healthPoint + ", Aircraft count: " + carrier.size() + ", Ammo Storage: " + stockOfAmmo + ", Total damage: " + sumDamage + "\nAircrafts:\n" + airplaneEachByEach;
        } else {
            status = "It's dead Jim :(";
        }
        return status;
    }
}
