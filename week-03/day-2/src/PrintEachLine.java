
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class PrintEachLine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tell me which file should we open!");
        String fileToBeOpened = scanner.nextLine();

        try { Path filePath = Paths.get(fileToBeOpened);
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines.get(0));
        } catch (Exception e) {
            System.out.println("Unable to read file: " + fileToBeOpened);
        }
    }
}