package aircraftcarrier;

public class F16 extends Aircraft {

    public F16(String type) {
        super(type);
        setMaxAmmo(8);
        setBaseDamage(30);
        setPriority(false);
    }
}
