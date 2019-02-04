package mostcommoncharacter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MostCommonCharacter {
    public static void main(String[] args) {



            Path filePath = Paths.get("exampleMostCommonCharacter");

        System.out.println("Most common character in file: " + mostCommonChar(filePath));;
    }
    public static Character mostCommonChar(Path pathName){

        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(pathName);
        } catch (IOException ex) {
            System.out.println("File does not exist!");
            return '0';
        }

        Map<Character, Integer> countHash = new HashMap<Character, Integer>();

        for (int i = 0; i < lines.size(); i++) {
            for (int j = 0; j < lines.get(i).length(); j++) {
                char currentChar = lines.get(i).charAt(j);
                if(countHash.get(currentChar)==null){
                    countHash.put(currentChar, 1);
                }else{
                    countHash.
                            put(currentChar, countHash.get(currentChar)+1);
                }
            }
        }

        int max = Collections.max(countHash.values());

        char mostCommonChar = 0;

        for(Map.Entry<Character, Integer> entry :countHash.entrySet()){
            if(entry.getValue() == max){
                mostCommonChar = entry.getKey();
            }
        }
        return mostCommonChar;
    }
}
