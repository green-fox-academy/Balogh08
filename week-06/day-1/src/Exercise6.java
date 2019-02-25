import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {
    public static void main(String[] args) {
        String myWord = "AbCdEf";

        myWord.chars().filter(Character::isUpperCase)
                .forEach(c -> System.out.print((char) c + " "));

        System.out.println();

        Path filePath = Paths.get("Exercise6.txt");
        List<String> lines = new ArrayList<>();

        try{
            lines = Files.readAllLines(filePath);
        } catch (Exception ex) {
            System.err.println("Could not read the file!");
        }

        for (String line : lines) {
            line.chars().filter(Character::isUpperCase)
                    .forEach(c -> System.out.print((char) c + " "));
        }



    }
}
