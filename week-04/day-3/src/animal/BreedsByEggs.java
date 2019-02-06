package animal;

public abstract class BreedsByEggs extends Animal {
    public BreedsByEggs(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "laying eggs";
    }

    @Override
    public  String getName(){
        return name;
    }
}
