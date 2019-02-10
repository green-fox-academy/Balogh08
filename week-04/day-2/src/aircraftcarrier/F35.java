package aircraftcarrier;

public class F35 extends Aircraft {

    public F35(String type) {
        super(type);
        setMaxAmmo(12);
        setBaseDamage(50);
        setType("F30");
        setPriority(true);
    }
}
