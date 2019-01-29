import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
    public static void main(String[] args) {
        Path filePath = Paths.get("../writeMultipleLines.txt");

        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to write?");
        String myWord = scanner.nextLine();

        System.out.println("And how many times?");
        int myNum = scanner.nextInt();
        writeMultipleLines(filePath, myWord, myNum);

    }

    public static void writeMultipleLines(Path pathOfTheFile, String wordToBeWritten, Integer howManyTimes){

        List<String> content = new ArrayList<>();
        for (int i = 0; i < howManyTimes ; i++) {
            content.add(i,wordToBeWritten);
        }

        try {
            Files.write(pathOfTheFile, content);
        } catch (Exception ex) {
        }
    }
}
