package animal;


public class Zoo {

    public static void main(String[] args) {

        Reptile reptile = new Reptile("Crocodile");
        Mammal mammal = new Mammal("Koala");
        Bird bird = new Bird("Parrot");

        System.out.println("How do you breed?");
        System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed() + ".");
        System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed() + ".");
        System.out.println("A " + bird.getName() + " is breeding by " + bird.breed() + ".");

        System.out.println();

        System.out.println("How do you live?");
        System.out.println("A " + reptile.getName() + " lives for " + reptile.getAge() + " years.");
        System.out.println("A " + mammal.getName() + "  lives for " + mammal.getAge() + " years.");
        System.out.println("A " + bird.getName() + " lives for " + bird.getAge() + " years.");
    }
}