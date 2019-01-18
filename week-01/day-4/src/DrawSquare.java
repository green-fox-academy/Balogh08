import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Give me a number, please!");
        int userInput1 = num.nextInt();

        for (int i = 0; i < userInput1; i++){
            for (int j = 0; j < userInput1; j++){
                if(i == 0 || j == 0){
                    System.out.print("X");
                }
                else if(i == userInput1 - 1 || j == userInput1 -1){
                    System.out.print("X");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
