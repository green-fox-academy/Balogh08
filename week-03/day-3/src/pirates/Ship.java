package pirates;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class Ship {
    String name;
    List <Pirate> crew = new ArrayList();
    Pirate caption;
    int numberOfWin = 0;
    int numberOfLose = 0;

    public Ship() {

    }

    public Ship(String name) {
        this.name = name;
    }

    public void fillShip() {

        caption = new Pirate("Captian", 0);

        getRidOfDeadBodies();

        if (crew.size() < 10 && crew.size() > 0) {
            for (int i = 0; i < 10 - crew.size(); i++) {
                Pirate pirate = new Pirate("pirate " + (crew.size() + i + 1), 0);
                crew.add(pirate);
            }
        }
        else if ( crew.size() == 0) {
            for (int i = 0; i < 10; i++) {
                Pirate pirate = new Pirate("pirate " + (i + 1), 0);
                crew.add(pirate);
            }
        }
        else {
            System.out.println("Crew is full");;
        }
    }

    public void getStatus(){
        System.out.println(name);
        System.out.println(caption.name + " consumed " + caption.rumDrank + " rum.");
        if (caption.alive && caption.rumDrank > 4) {
            System.out.println("He is alive, but passed out!");
        }
        else if (caption.alive && caption.rumDrank < 5) {
            System.out.println("He is alive, and sober!");
        }
        else {
            System.out.println("He is dead!");
        }

        getRidOfDeadBodies();

        System.out.println("Number of alive pirates in crew: " + crew.size());
        System.out.println("Number of wins: " + numberOfWin);
        System.out.println("Number of loses: " + numberOfLose);
    }



    public boolean battle(Ship otherShip) {
        int scoreShip1;
        int scoreShip2;

        getRidOfDeadBodies();
        scoreShip1 = crew.size() - caption.rumDrank;

        otherShip.getRidOfDeadBodies();
        scoreShip2 = otherShip.crew.size() - otherShip.caption.rumDrank;

        do {
            if (scoreShip1 == scoreShip2) {
                randomParty();
                otherShip.randomParty();
            }

            getRidOfDeadBodies();
            scoreShip1 = crew.size() - caption.rumDrank;

            otherShip.getRidOfDeadBodies();
            scoreShip2 = otherShip.crew.size() - otherShip.caption.rumDrank;

        }while (scoreShip1 == scoreShip2);



        if (scoreShip1 > scoreShip2) {
            randomParty();

            for (Pirate pirates: otherShip.crew
                 ) {
                int randomDies = (int) (Math.random() * 10);
                if (randomDies > 5) {
                    pirates.die();
                }
            }

            otherShip.getRidOfDeadBodies();
            numberOfWin++;
            otherShip.numberOfLose++;
            return true;
        }



        otherShip.randomParty();

        for (Pirate pirates : crew) {
            int randomDies = (int) (Math.random() * 10);
            if (randomDies > 5) {
                pirates.die();
            }
        }

        getRidOfDeadBodies();
        otherShip.numberOfWin++;
        numberOfLose++;
        return false;

    }



    public void randomParty() {
        caption.drinkSomeRum((int) (Math.random() * 4));
        for (Pirate pirates : crew
        ) {
            pirates.drinkSomeRum((int) (Math.random() * 4));
        }
    }

    public void getRidOfDeadBodies(){
        for (int i = 0; i < crew.size() ; i++) {
            if (!crew.get(i).alive) {
                crew.remove(i);
            }
        }
    }
}
