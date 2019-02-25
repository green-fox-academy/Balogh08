package exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise10 {
    public static void main(String[] args) {
        List<Fox> myFoxes = new ArrayList<>();
        myFoxes.add(new Fox("Fox1","Green",5));
        myFoxes.add(new Fox("Fox2","Blue",15));
        myFoxes.add(new Fox("Fox3","Red",3));
        myFoxes.add(new Fox("Fox4","Green",7));
        myFoxes.add(new Fox("Fox5","Yellow",5));


        System.out.println("Foxes with green color:");
        myFoxes.stream()
                .filter(fox -> fox.getColor().equals("Green"))
                .forEach(fox -> System.out.println(fox.getName()));

        System.out.println("Foxes with green color and with age less than 5");
        myFoxes.stream()
                .filter(fox -> fox.getColor().equals("Green") && fox.getAge() < 5)
                .forEach(fox -> System.out.println(fox.getName()));

        System.out.println("Foxes frequency by color");
        Map<String, List<Fox>> frequency = myFoxes.stream()
                .collect(Collectors.groupingBy(Fox::getColor));

        System.out.println(frequency);
    }
}
