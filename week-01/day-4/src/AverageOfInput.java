import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Give 5 number!");
        int userInput1 = num1.nextInt();
        int userInput2 = num1.nextInt();
        int userInput3 = num1.nextInt();
        int userInput4 = num1.nextInt();
        int userInput5 = num1.nextInt();


        System.out.println("Sum: " + (userInput1 + userInput2 + userInput3 + userInput4 + userInput5) + " | Average: " + ((userInput1 + userInput2 + userInput3 + userInput4 + userInput5)/5));

    }
}
