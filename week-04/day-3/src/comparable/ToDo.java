package comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ToDo {

    public static void main(String[] args) {
        List fleet = new ArrayList();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing milk = new Thing("Get milk");
        Thing obstacles = new Thing("Remove the obstacles");
        Thing standUp = new Thing("Stand Up");
        Thing lunch = new Thing("Eat lunch");


        standUp.complete();
        lunch.complete();


        fleet.add(milk);
        fleet.add(standUp);
        fleet.add(lunch);
        fleet.add(obstacles);

        Collections.sort(fleet);
        System.out.println(fleet);
    }
}