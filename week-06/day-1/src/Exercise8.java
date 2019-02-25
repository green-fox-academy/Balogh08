import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        String concatenateStrings = cities.stream()
                .collect(Collectors.joining());

        System.out.println(concatenateStrings);
    }
}
