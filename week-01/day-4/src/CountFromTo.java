import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Give me a number!");
        int userInput1 = num.nextInt();

        System.out.println("Give me one more number!");
        int userInput2 = num.nextInt();

        if(userInput1 >= userInput2){
            System.out.println("The second number should be bigger");
        }
        else {
            while (userInput1 < userInput2){
                int i = 0;
                System.out.println(userInput1);
                userInput1++;
            }
        }
    }
}
