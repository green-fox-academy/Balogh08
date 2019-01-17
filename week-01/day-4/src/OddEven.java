import java.io.Console;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);

        System.out.println("Give a number!");

        int userInput1 = num1.nextInt();

        if (userInput1 % 2 == 0){
            System.out.println("It is an \"Even\" number");
        }
        else System.out.println("It is an \"Odd\" number");
    }
}
