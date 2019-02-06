package pirates;

public class WarApp {
    public static void main(String[] args) {
        Armada armada1 = new Armada("New England Patriots' Armada");
        Armada armada2 = new Armada("Los Angeles Rams' Armada");
        armada1.fillArmada();
        armada2.fillArmada();

        armada1.partyForArmada();
        armada2.partyForArmada();



        armada1.brawlOfArmada();
        armada2.brawlOfArmada();


        System.out.println(armada1.war(armada2));
    }
}
