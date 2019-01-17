import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Give me a number!");
        int userInput1 = num.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.println(i + " * " + userInput1 + " = " + (i*userInput1));
        }
    }
}
