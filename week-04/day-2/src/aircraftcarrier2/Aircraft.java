package aircraftcarrier2;

public class Aircraft extends Carrier {
    private int ammoCurrent;
    private String type;
    private int ammoMax;
    private int baseDamage;
    private boolean isPriority;

    public Aircraft() {
        ammoCurrent = 0;
        isPriority = false;
    }

    public int fight() {
        int damage = ammoCurrent * baseDamage;
        setAmmoCurrent(0);
        return damage;
    }

    public int refill(int stock) {
        if (stock > getAmmoMax()) {
            setAmmoCurrent(getAmmoMax());
            stock -= getAmmoCurrent();
        } else {
            setAmmoCurrent(stock);
            stock -= getAmmoCurrent();
        }
        return stock;
    }

    void setAmmoCurrent(int ammoCurrent) {
        if(ammoCurrent > ammoMax) {
            this.ammoCurrent = ammoMax;
        } else {
            this.ammoCurrent = ammoCurrent;
        }
    }

    public void setAmmoMax(int ammoMax) {
        this.ammoMax = ammoMax;
    }

    protected void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }


    public int getAmmoCurrent() {
        return ammoCurrent;
    }

    public int getAmmoMax() {
        return ammoMax;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String getStatus() {
        String status = "Type " + getType() + ", Ammo: " + getAmmoCurrent() + ", Base Damage: " + getBaseDamage() + ", All Damage: " + (getBaseDamage() * getAmmoCurrent());
        return status;
    }

    public void setPriority(boolean priority) {
        isPriority = priority;
    }

    public boolean isPriority() {
        return isPriority;
    }
}
