import java.util.Scanner;

public class mileToKmConverter {
    public static void main(String[] args) {
        Scanner km = new Scanner(System.in);
        System.out.println("How many km do you have travel every Morning to Green Fox?");
        int userInput = km.nextInt();
        System.out.println("That is " + (userInput * 1.6) + "m mile!");

    }
}
