import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class raindydays2 {
    public static void main(String[] args) {
        System.out.println(mostRainyCity("rainydays"));
    }

    public static String mostRainyCity(String fileName) {
        Path filePath = Paths.get(fileName);
        List<String> lines = new ArrayList<>();

        try {
            lines.addAll(Files.readAllLines(filePath));
        } catch (IOException ex) {
            System.out.println("Could not find this file!");
        }
        Map<String, Integer> rainyCities = new HashMap<>();

        for (String line : lines) {
            String[] splitArray = line.split(",");
            if (rainyCities.containsKey(splitArray[1]) && splitArray[2].equals("RAINY")) {

                rainyCities.put(splitArray[1], rainyCities.get(splitArray[1]) + 1);
            } else if (splitArray[2].equals("RAINY")) {
                rainyCities.put(splitArray[1], 1);
            }
        }

        for (String city : rainyCities.keySet()) {
            System.out.println(city + " " + rainyCities.get(city));
        }

        String mostRainyCity = "";
        int mostRainy = 0;
        List<String> equallyRainyCities = new ArrayList<>();
        for (String city : rainyCities.keySet()) {
            if (mostRainy == rainyCities.get(city)) { ;
                equallyRainyCities.add(city);
            }
            if (mostRainy < rainyCities.get(city)) {
                mostRainy = rainyCities.get(city);
                mostRainyCity = city;
            }
        }
        if (equallyRainyCities.size() > 1){
            for (String city : equallyRainyCities) {
                mostRainyCity += " " + city;
            }
        }
        return mostRainyCity;

    }
}
