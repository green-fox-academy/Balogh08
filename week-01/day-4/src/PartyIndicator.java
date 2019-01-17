import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("How many girls will come to your house party?");
        int girls = num.nextInt();

        System.out.println("How many boys will come to your house party?");
        int boys = num.nextInt();

        if (boys == girls && boys + girls >=20){
            System.out.println("The party is excellent!");
        }
        else if (boys != girls && boys + girls >=20 && girls != 0){
            System.out.println("Quite cool party!");
        }
        else if (boys + girls < 20 && girls != 0){
            System.out.println("Average party...");
        }
        else if (girls == 0){
            System.out.println("Sausage party!");
        }
    }
}
