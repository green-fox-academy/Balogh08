package pirates;


public class Pirate {
    String name;
    int rumDrank = 0;
    boolean alive = true;
    String parrot;

    public Pirate() {

    }

    public Pirate(String name, int rumDrank) {
        this.name = name;
        this.rumDrank = rumDrank;

    }

    public void drinkSomeRum() {
        rumDrank++;
    }

    public void drinkSomeRum(int numberOfRum) {
        if (alive && rumDrank < 5) {
            rumDrank += numberOfRum;
        }
        else if (!alive){
            System.out.println("He's dead");
        }
        else {
            System.out.println(name + " is passed out!");
        }
    }

    public void howsItGoingMate() {
        if (rumDrank <= 4) {
            System.out.println("Pour me anudder!");;
        }
        else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            rumDrank = 0;
        }
    }

    public void die() {
        alive = false;
    }

    public void brawl(Pirate otherPirate) {
        if (otherPirate.alive) {
            int oneThirdChance = (int) (Math.random() * 3);
            if (oneThirdChance == 1){
                otherPirate.die();
                System.out.println(otherPirate.name + " has died!");
            }

            else if (oneThirdChance == 2) {
                die();
                System.out.println(name + " has died!");
            }

            else{
                System.out.println("They both have passed out!");
                rumDrank = 0;
                otherPirate.rumDrank = 0;
            }
        }
    }

    public void setParrot() {
        parrot = name + "'s parrot";
    }
}
