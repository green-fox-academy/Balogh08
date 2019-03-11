import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Weather {
    public static void main(String[] args) {
        System.out.println(mostRainyCity("rainydays"));

    }

    public static String mostRainyCity(String fileName) {

        List<String> lines = new ArrayList<>();

        try {
            Path filePath = Paths.get(fileName);
            lines.addAll(Files.readAllLines(filePath));
        } catch (IOException ex) {
            System.out.println("Could not find this file!");
        }

        Map<String, Integer> rainyCities = new HashMap<>();
        List<Integer> days = new ArrayList<>();

        for (String line : lines) {
            String[] splitArray = line.split(",");
            String[] dates = splitArray[0].split("-");
            int day = 0;
            try {
                day = Integer.parseInt(dates[2]);
            } catch (NumberFormatException ex) {
                System.out.println("It's not a day");
            }
            days.add(day);
        }


        String isIt15 = "";
        for (int day : days) {
            if (day == 15) {
                isIt15 = "Day 15 is in list";
            }
        }

        for (String line : lines) {
            String[] splitArray = line.split(",");
            if (rainyCities.containsKey(splitArray[1]) && splitArray[2].equals("RAINY")) {
                int valueOfRainyCity = rainyCities.get(splitArray[1]);
                rainyCities.put(splitArray[1], valueOfRainyCity++);
            } else if (!rainyCities.containsKey(splitArray[1]) && splitArray[2].equals("RAINY")) {
                rainyCities.put(splitArray[1], 1);
            }
        }

        String mostRainyCity = "";
        int mostRainy = 0;
        for (String city : rainyCities.keySet()) {
            if (mostRainy < rainyCities.get(city)) {
                mostRainy = rainyCities.get(city);
                mostRainyCity = city;
            }
        }


        return mostRainyCity + " " + isIt15;
    }
}
