import java.util.ArrayList;
import java.util.Arrays;

public class SolarSystem {
    public static void main(String[] args) {
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));
        planetList.add(5,"Saturn");
        System.out.println(planetList);

        for (int i = 0; i < planetList.size(); i++) {
            System.out.println(planetList.get(i));
        }
    }
}
