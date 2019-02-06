package animal;

public class Reptile extends BreedsByEggs {

    public Reptile(String name) {
        super(name);
    }

    @Override
    public int getAge() {
        return 2;
    }


}
