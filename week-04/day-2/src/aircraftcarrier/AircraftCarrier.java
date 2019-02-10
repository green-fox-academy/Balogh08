package aircraftcarrier;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class AircraftCarrier {
    List<Aircraft> carrierOfAircrafts;
    private int carrierAmmo;
    private int healthPoint;

    public AircraftCarrier (int carrierAmmo, int healthPoint) {
        carrierOfAircrafts = new ArrayList<>();
        this.carrierAmmo = carrierAmmo;
        this.healthPoint = healthPoint;
    }

    public void addAircraft(Aircraft aircraft) {
        carrierOfAircrafts.add(aircraft);
    }

    public void fill() {
        if (carrierAmmo == 0) {
            throw new EmptyStackException();
        }

        List<Aircraft> notPriorityAircraft = new ArrayList<>();
        for (Aircraft aircrafts : carrierOfAircrafts) {
            if (aircrafts.getPriority()) {
                aircrafts.refill(carrierAmmo);
                this.carrierAmmo -= aircrafts.getAmmo();
            }
            else {
                notPriorityAircraft.add(aircrafts);
            }
        }

        for (Aircraft aircrafts : notPriorityAircraft) {
            aircrafts.refill(carrierAmmo);
            this.carrierAmmo -= aircrafts.getAmmo();
        }
    }

    public int getHealtPoint() {
        return this.healthPoint;
    }

    public int getCarrierAmmo() {
        return this.carrierAmmo;
    }

    public void fight(AircraftCarrier otherAircraftCarrier) {
        int sumDamageOfAttacker = 0;

        for (Aircraft aircrafts: carrierOfAircrafts) {
            sumDamageOfAttacker += aircrafts.fight();
        }

        otherAircraftCarrier.healthPoint -= sumDamageOfAttacker;
    }

    public String getStatus() {
        int totalDamage = 0;
        String status ="";

        for (Aircraft aircrafts : carrierOfAircrafts) {
            totalDamage += aircrafts.getDamage();
        }
        String statusOfAircrafts = "";
        for (Aircraft aircrafts : carrierOfAircrafts) {
            statusOfAircrafts += aircrafts.getStatus();

        }


        if (getHealtPoint() > 0) {
            status = "HP: " + getHealtPoint() + ", Aircraft count: " + carrierOfAircrafts.size() + ", Ammo Storage: " + getCarrierAmmo() + ", Total damage: " + totalDamage + "\nAircrafts:\n" + statusOfAircrafts;
        }
        else {
            status = "It's dead Jim :(";
        }

        return status;
    }
}
