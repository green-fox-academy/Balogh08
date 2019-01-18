import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Give me a number, please!");
        int userInput1 = num.nextInt();
        if (userInput1 % 2 == 1) {
            for (int i = 0; i < userInput1; i++) {
                for (int j = 0; j < userInput1; j++) {
                    if (i < userInput1 / 2 + 0.5 && j >= (userInput1 - 1) / 2 - i && j <= (userInput1 - 1) / 2 + i) {
                        System.out.print("X");
                    } else if (i >= userInput1 / 2 + 0.5 && j > (userInput1 - 1) / 2 - (userInput1 - i) && j < (userInput1) / 2 + (userInput1 - i))
                        System.out.print("X");
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        else{
            for (int i = 0; i < userInput1; i++) {
                for (int j = 0; j < userInput1; j++) {
                    if (i < userInput1 / 2 && j >= userInput1 / 2 - i && j <= userInput1 / 2 + i) {
                        System.out.print("X");
                    } else if (i >= userInput1 / 2 && j >= userInput1 / 2 + 0.5 - (userInput1 - i) && j <= (userInput1) / 2 - 0.5 + (userInput1 - i))
                        System.out.print("X");
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }


    }
}
