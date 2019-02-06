package pirates;

public class Pirate {
    String name;
    int gold;
    int HP = 10;
    boolean isCaptain = false;
    boolean isWoodenLeg = false;


    public Pirate(String name, int gold) {
        this.name = name;
        this.gold = gold;
    }

    public String work() {
        String pirateIntroduction;

        if (isCaptain) {
            gold += 10;
            HP -= 5;
        }
        else {
            gold++;
            HP--;
        }

        if (isWoodenLeg) {
            pirateIntroduction = " - Hello, I'm " + name + " I have a wooden leg and " + gold + " golds.";
        }
        else {
            pirateIntroduction = " - Hello, I'm " + name + ". I still have my real legs and " + gold + " golds.";
        }

        return pirateIntroduction;
    }

    public void party() {
        if (isCaptain) {
            HP += 10;
        }
        else {
            HP++;
        }
    }

    public void randomWoodenLeg() {
        int randomChance = (int) (Math.random() * 100);

        if(randomChance < 33) {
            isWoodenLeg = true;
        }
    }
}
