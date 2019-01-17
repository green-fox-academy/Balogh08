import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);

        System.out.println("Give a number");

        int userInput = num1.nextInt();

        if (userInput <= 0)
            System.out.println("Nout enough!");
        else if (userInput == 1) {
            System.out.println(1);
        }
        else if (userInput == 2){
            System.out.println(2);
        }
        else {
            System.out.println("A lot!");
        }
    }
}
