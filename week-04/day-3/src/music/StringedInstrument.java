package music;

public abstract class StringedInstrument extends Instrument {
    int numberOfStrings;

    @Override
    public void play() {
        System.out.println(this.name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
    }

    public abstract String sound();
}
