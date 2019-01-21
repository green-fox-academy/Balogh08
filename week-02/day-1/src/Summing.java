import java.util.Scanner;

public class Summing {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);

        System.out.println("How many numbers should be added?");
        int userInput1 = num1.nextInt();
        System.out.println(sum(userInput1));
    }
        public static int sum(int userParameter)
        {
            int sumOfNumbers = 0;
            for (int i = 0; i < userParameter; i++) {
                System.out.println("Then give me " + (userParameter - i) + " number(s)!");
                Scanner num2 = new Scanner(System.in);
                int userNumbers = num2.nextInt();
                sumOfNumbers = sumOfNumbers + userNumbers;

            }
            return sumOfNumbers;
        }
}


