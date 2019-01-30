package counter;

public class Counter {
    int value;
    int initializedValue;

    public Counter(){
        value = 0;
        initializedValue = 0;
    }

    public Counter(int value){
        this.value = value;
        this.initializedValue = value;
    }

    public void add(int number){
        value += number;
    }

    public void add(){
        value++;
    }
    public int get(){
        return value;
    }
    public void reset(){
        value = initializedValue;
    }
}
