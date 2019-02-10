package animal;

public abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public abstract String getName();

    public abstract String breed();

}
