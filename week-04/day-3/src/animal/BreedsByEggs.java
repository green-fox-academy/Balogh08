package animal;

public abstract class BreedsByEggs extends Animal {
    public BreedsByEggs(String name, int age) {
        super(name, age);
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
