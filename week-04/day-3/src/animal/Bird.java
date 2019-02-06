package animal;

public class Bird extends BreedsByEggs {


    public Bird(String name) {
        super(name);
    }
    @Override
    public int getAge() {
        return 5;
    }
}
