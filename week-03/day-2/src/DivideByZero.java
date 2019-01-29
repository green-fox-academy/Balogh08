import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number by which 10 will be divided!");
        int userInput = scanner.nextInt();
        int result = 10;

        divideByZero(result,userInput);

    }

    public static void divideByZero(int numToBeDivided, int numByDivide){

        try {
            numToBeDivided = numToBeDivided / numByDivide;
            System.out.println(numToBeDivided);
        } catch (java.lang.ArithmeticException ex) {
            System.out.println("fail");
        }
    }
}
