import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Give me a number, please!");
        int userInput1 = num.nextInt();

        for (int i = 0; i < userInput1; i++){
            for (int j = 0; j < 2 * userInput1 - 1; j++ ){
                if (j >= userInput1 - 1 - i && j <= userInput1 - 1 + i) {
                    System.out.print("X");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
