package music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        this.name = "BassGuitar";
        this.numberOfStrings = 4;
    }

    public BassGuitar(int numberOfStrings) {
        this.name = "BassGuitar";
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }
}
