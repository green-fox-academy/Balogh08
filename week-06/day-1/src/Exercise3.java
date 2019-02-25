import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);

        numbers.stream()
                .filter(num -> num * num > 20)
                .sorted()
                .forEach(System.out::println);

        List<Integer> moreThan20 = numbers.stream()
                .filter(n -> n * n > 20)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(moreThan20);
    }
}
