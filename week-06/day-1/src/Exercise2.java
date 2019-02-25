import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        List<Integer> squaredValues = numbers.stream()
                .filter(num -> num > 0)
                .map(num -> num * num)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(squaredValues);
        
        numbers.stream()
                .filter(num -> num > 0)
                .map(num -> num * num)
                .sorted()
                .forEach(System.out::println);
    }
}
