import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {

        Path filePath = Paths.get("my-file.txt");
        addMyNameAndPrint(filePath);


    }
    public static void addMyNameAndPrint(Path fileToBeAdded){

        List<String> contentOfMyFile = new ArrayList<>();
        contentOfMyFile.add("Botond Balogh");


        try {
            Files.write(fileToBeAdded, contentOfMyFile);
            List<String > lines = Files.readAllLines(fileToBeAdded);
            System.out.println(lines.get(0));
        } catch (Exception ex) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}
