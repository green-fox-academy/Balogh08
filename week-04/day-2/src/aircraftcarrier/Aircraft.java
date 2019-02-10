package aircraftcarrier;

public class Aircraft {
    private int ammo;
    private int maxAmmo;
    private int baseDamage;
    private String type;
    private boolean isPriority;
    private int damage;

    public Aircraft(String type) {
        setType(type);
        ammo = 0;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }


    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPriority(Boolean priority) {
        isPriority = priority;
    }

    public Boolean getPriority() {
        return isPriority;
    }

    public String getStatus() {
        String status = "";
        setDamage();
        return status = "Type " + type + ", Ammo: " + ammo + ", Base Damage: " + baseDamage + ", All Damage: " + damage + "\n";
    }

    public void setDamage() {
        this.damage = baseDamage * ammo;
    }

    public int getDamage() {
        return damage  = baseDamage * ammo;
    }

    public int fight() {
        int ammoHolder = ammo;
        setAmmo(0);
        return  this.damage = ammoHolder * baseDamage;
    }

    public int refill(int fillBy) {
        if (fillBy > maxAmmo) {
            setAmmo(maxAmmo);
            setDamage();
            return fillBy - maxAmmo;
        }
        else {
            setDamage();
            setAmmo(fillBy);
            return 0;
        }
    }
}
