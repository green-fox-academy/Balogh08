import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        Path firstFilePath = Paths.get("file1.txt");
        Path secondFilePath = Paths.get("file2.txt");
        Path copyThisFilesContent = Paths.get("definition.txt");

        writeLines(firstFilePath);
        copyText(firstFilePath, secondFilePath);
        copyText(copyThisFilesContent, secondFilePath);

    }

    public static void writeLines(Path fileToWriteLines) {

        List<String> linesOfFile1 = new ArrayList<>();
        linesOfFile1.add("First line to be copied");
        linesOfFile1.add("Second line to be copied");
        linesOfFile1.add("Third line to be copied");

        try {
            Files.write(fileToWriteLines, linesOfFile1);
        } catch(Exception ex) {
            System.out.println("Oh, no! I could not write your" + fileToWriteLines);
        }

}

    public static void copyText (Path copyFromFile, Path pasteToFile){
        List<String> existingLinesOfPasteToFile = new ArrayList<>();
        try {
            existingLinesOfPasteToFile = Files.readAllLines(pasteToFile);
        } catch (Exception ex) {
            System.out.println("I'm sorry, " + pasteToFile + " does not exist yet.");
        }

        try {
            existingLinesOfPasteToFile.addAll(Files.readAllLines(copyFromFile));
            Files.write(pasteToFile, existingLinesOfPasteToFile);
        } catch (Exception ex) {
            System.out.println("Oh, no! I could not copy your" + copyFromFile);
        }
    }
}
