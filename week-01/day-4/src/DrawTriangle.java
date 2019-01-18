import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);

        System.out.println("Give me a number, please!");
        int userInput1 = num.nextInt();
        String a = "*";
        for (int i = 0; i < userInput1; i++){
            System.out.println(a);
            a = a + "*";
        }
    }
}
