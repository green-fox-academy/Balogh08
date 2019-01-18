import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Guess my number!");

        int solution = 8;
        boolean win = true;
        while (win){
            int userInput1 = num.nextInt();
            if (userInput1 < solution){
                System.out.println("The solution is higher! Guess again!");
            }
            else if(userInput1 > solution){
                System.out.println("The solution is lower! Guess again!");
            }
            else{
                win = false;
            }
        }
        System.out.println("Congratulation! You guessed it. The solution is " + solution);
    }
}
