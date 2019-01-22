import java.util.Arrays;
import java.util.List;

public class AppendLetter {
    public static void main(String[] args) {
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");

        String placeHolder = "";
        for (int i = 0; i < far.size(); i++) {
            placeHolder = far.get(i) + "a";
            far.set(i, placeHolder);
        }

        System.out.println(far);
    }
}
