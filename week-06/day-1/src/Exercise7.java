import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        System.out.println("Give me the first letter of the city you are looking for!");

        Scanner scanner = new Scanner(System.in);

        String myWord = scanner.nextLine();
        String charToUse = myWord.substring(0,1);


        cities.stream()
                .filter(word -> word.startsWith(charToUse.toUpperCase()))
                .forEach(System.out::println);
    }
}
