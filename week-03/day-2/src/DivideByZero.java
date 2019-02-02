import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number by which 10 will be divided!");
        int userInput = scanner.nextInt();
        divideByZero(userInput);

    }

    public static void divideByZero( int numByDivide){

        int numToBeDivided = 10;

        try {
            numToBeDivided = numToBeDivided / numByDivide;
            System.out.println(numToBeDivided);
        } catch (java.lang.ArithmeticException ex) {
            System.err.println("fail");
        }
    }
}
