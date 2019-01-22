import java.util.ArrayList;
import java.util.Arrays;

public class Matchmaking {
    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane","Rozi","Natália","Móni"));
        ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        ArrayList<String> pairs = new ArrayList<>();

        System.out.println(makingMatches(girls,boys,pairs));
    }


    public static Object makingMatches(ArrayList a, ArrayList b, ArrayList c){
        int maxSize = 0;
        if (a.size() >= b.size()){
            maxSize = a.size();
        }
        else{
            maxSize = b.size();
        }

        for (int i = 0; i < maxSize; i++) {
            if (i < a.size()){
                c.add(a.get(i));
            }
            if (i < b.size()){
                c.add(b.get(i));
            }
        }
        return c;
    }
}