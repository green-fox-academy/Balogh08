import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);

        System.out.println("Please, give me a number!");
        int userInput1 = num.nextInt();


        int i = 0;
        int j = 0;
        while ( j < userInput1) {
            while (i < userInput1) {
                if (j == i){
                    System.out.print("%");
                }

                else if (i == 0 || j == 0){
                    System.out.print("%");
                }

                else if (i == userInput1 - 1 || j == userInput1 -1){
                    System.out.print("%");
                }

                else{
                    System.out.print(" ");
                }

                i++;
            }

            System.out.println("");
            i = 0;
            j++;
        }
    }
}