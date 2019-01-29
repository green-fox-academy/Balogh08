import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        Path filePath = Paths.get("definition.txt");

        lineContains(filePath);
    }


    public static void lineContains(Path fileName){
        try {
            List<String> lines = Files.readAllLines(fileName);
            System.out.println(lines.size());
        } catch (Exception ex) {
            System.out.println(0);
        }
    }
}
