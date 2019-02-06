package pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    String name;
    List<Pirate> crew = new ArrayList();
    Pirate captainOfShip;
    boolean isCaptainExists = false;


    public Ship(String name) {
        this.name = name;
    }

    public void fillShip(int numberOfPiratesToBeAdded, int initializeGold) {

        if (!isCaptainExists) {
            captainOfShip = new Pirate("Captian", 50);
            captainOfShip.isCaptain = true;
            crew.add(captainOfShip);
            isCaptainExists = true;
        }

        for (int i = 0; i < numberOfPiratesToBeAdded; i++) {
            Pirate pirate = new Pirate ("Pirate " + crew.size(), initializeGold);
            pirate.randomWoodenLeg();
            crew.add(pirate);
        }
    }

    public List<String> getPoorPirates() {
    List<String> poorPirates = new ArrayList<>();
        for (Pirate pirates : crew
             ) {
            if (pirates.isWoodenLeg && pirates.gold < 15){
                poorPirates.add(pirates.name);
            }
        }
        return poorPirates;
    }

    public int getGolds() {
    int sumOfGold = 0;

        for (Pirate pirates : crew
             ) {
            sumOfGold += pirates.gold;
        }
        return sumOfGold;
    }

    public void lastDayOnTheShip(){
        for (Pirate pirates : crew
        ) {
            pirates.party();
        }
    }

    public void prepareForBattle(){
        for (Pirate pirates : crew
        ) {
            for (int i = 0; i < 5; i++) {
                pirates.work();
            }
        }
        lastDayOnTheShip();
    }
}
