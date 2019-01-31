package refactorio;

import java.util.Scanner;

public class Refactorio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number, please!");
        int userInput = scanner.nextInt();

        System.out.println("The factorial of your number is: " + refactorio(userInput));
    }

    public static int refactorio(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * refactorio(n - 1);
    }
}
