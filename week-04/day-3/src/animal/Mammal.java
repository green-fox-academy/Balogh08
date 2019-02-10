package animal;

public class Mammal extends Animal {

    public Mammal (String name, int age) {
        super(name, age);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String breed() {
        return "pushing miniature versions out";
    }

}
