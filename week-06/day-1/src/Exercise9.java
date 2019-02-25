import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise9 {
    public static void main(String[] args) {
        String myWord = "Megszentsegtelenithetehelenesegesgedeseitekert";

        Map<Character, Integer> numberOfCharacters = myWord.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c -> 1)));

        System.out.println(numberOfCharacters);

        Map<Character, Integer> frequency = myWord.chars().mapToObj(c -> (char) c)
                .collect(Collectors.toMap(Function.identity(), c -> 1, Math::addExact));

        System.out.println(frequency);
    }
}
