public class Animal {
    int hunger;
    int thirst;

    public Animal(){
        hunger = 50;
        thirst = 50;
    }

    public int eat(){
        if (hunger  == 0) {
            return 0;
        }
        return hunger--;
    }

    public int drink(){
        if (thirst  == 0) {
            return 0;
        }
        return thirst--;
    }

    public void play(){
        hunger++;
        thirst++;
    }
}
