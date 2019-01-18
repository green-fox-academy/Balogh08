import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);

        System.out.println("Give a number, please!");
        int userInput1 = num.nextInt();
        int sum = 0;

        for (int i = 0; i < userInput1; i++){
            if (i == userInput1 - 1){
                System.out.println("Great! Than give me one more number, please!");
            }
            else {
                System.out.println("Great! Than give me " + (userInput1 - i) + " more numbers, please!");
            }
            int userInput2 = num.nextInt();
            sum = sum + userInput2;
        }

        int average = sum/userInput1;

        System.out.println("The sum of your numbers is: \"" + sum + "\". And the average of your number is: \"" + average + "\".");

    }
}
