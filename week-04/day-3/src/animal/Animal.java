package animal;

public abstract class Animal {
    String name;
    int age;

    public Animal(String name) {
        this.name = name;
    }


    public abstract String getName();

    public abstract String breed();

    public abstract int getAge();

}
