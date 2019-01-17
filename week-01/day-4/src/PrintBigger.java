import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Give me a number!");
        int userInput1 = num.nextInt();

        System.out.println("Give me another number!");
        int userInput2 = num.nextInt();

        if (userInput1 > userInput2){
            System.out.println(userInput1 + " is bigger!");
        }
        else if (userInput1 == userInput2){
            System.out.println("They are equal!");
        }
        else {
            System.out.println(userInput2 + " is bigger!");
        }
    }
}
