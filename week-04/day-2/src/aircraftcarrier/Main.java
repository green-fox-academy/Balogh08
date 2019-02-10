package aircraftcarrier;

public class Main {
    public static void main(String[] args) {
        AircraftCarrier carrier1 = new AircraftCarrier(1000,3500);
        AircraftCarrier carrier2 = new AircraftCarrier(1000,3500);
        Aircraft f16First = new F16("F16");
        Aircraft f16Second = new F16("F16");
        Aircraft f35First = new F35("F36");
        Aircraft f35Second = new F35("F36");
        Aircraft f35Third = new F35("F36");


        carrier1.addAircraft(f16First);
        carrier1.addAircraft(f16Second);
        carrier1.addAircraft(f35First);
        carrier1.addAircraft(f35Second);
        carrier1.addAircraft(f35Third);
        while (carrier2.getHealtPoint() > 0) {
            try {
                carrier1.fill();
            }catch (Exception ex) {
                System.out.println("EmptyStackException --->Out of ammo");
            }
            System.out.println(carrier1.getStatus());
            carrier1.fight(carrier2);
            System.out.println(carrier2.getStatus());
        }


    }
}
