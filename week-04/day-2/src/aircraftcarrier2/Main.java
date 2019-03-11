package aircraftcarrier2;

public class Main {
    public static void main(String[] args) {

        Carrier carrierOne = new Carrier(1000,10000);
        Carrier carrierTwo = new Carrier(1000,10000);

        randomFill(carrierOne);
        randomFill(carrierTwo);

        while(carrierOne.healthPoint > 0 && carrierTwo.healthPoint > 0) {
            carrierOne.fight(carrierTwo);
            System.out.println(carrierOne.getStatus());
            System.out.println(carrierTwo.getStatus());

            if (carrierTwo.healthPoint > 0) {
                carrierTwo.fight(carrierOne);
                System.out.println(carrierOne.getStatus());
                System.out.println(carrierTwo.getStatus());
            }
            carrierOne.fill();
            carrierTwo.fill();
        }
    }

    public static void randomFill(Carrier carrier) {
        int randomNum = (int) (Math.random() * 40);
        for (int i = 0; i < randomNum; i++) {
            if (i % 4 == 0) {
                carrier.add("F35");
            } else {
                carrier.add("F16");
            }
        }
        carrier.fill();
    }
}
