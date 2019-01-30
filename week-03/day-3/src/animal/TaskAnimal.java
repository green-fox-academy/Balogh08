package animal;

public class TaskAnimal {
    public static void main(String[] args) {
        Animal dog = new Animal();
        System.out.println("Dog's attributes: \nThirst:" + dog.thirst + "\nHunger: " + dog.hunger + "\n");

        dog.eat();
        System.out.println("Dog's attributes: \nThirst:" + dog.thirst + "\nHunger: " + dog.hunger + "\n");

        dog.drink();
        System.out.println("Dog's attributes: \nThirst:" + dog.thirst + "\nHunger: " + dog.hunger + "\n");

        dog.play();
        System.out.println("Dog's attributes: \nThirst:" + dog.thirst + "\nHunger: " + dog.hunger + "\n");
    }
}
