package animal;


public class Zoo {

    public static void main(String[] args) {

        Reptile reptile = new Reptile("Crocodile", 10);
        Mammal mammal = new Mammal("Koala", 8);
        Bird bird = new Bird("Parrot", 5);

        System.out.println("How do you breed?");
        System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed() + ".");
        System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed() + ".");
        System.out.println("A " + bird.getName() + " is breeding by " + bird.breed() + ".");

        System.out.println();

        System.out.println("How do you live?");
        System.out.println("A " + reptile.getName() + " lives for " + reptile.age + " years.");
        System.out.println("A " + mammal.getName() + "  lives for " + mammal.age + " years.");
        System.out.println("A " + bird.getName() + " lives for " + bird.age + " years.");

        bird.fly();
        bird.land();
        bird.takeOff();
    }
}