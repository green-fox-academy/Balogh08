import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner chicken = new Scanner(System.in);
        Scanner pigs = new Scanner(System.in);

        System.out.println("How many chicken does the farmer have?");
        int chikenInput = chicken.nextInt();
        System.out.println("And how many  pigs does he have?");
        int pigsInput = pigs.nextInt();

        int chickenLegs = 2;
        int pigLegs = 4;

        System.out.println("The animals overall have " +((chickenLegs * chikenInput) + (pigLegs * pigsInput)) + " legs.");

    }
}
