import java.util.ArrayList;

public class Sum {
    ArrayList<String> stringArrayList;

    public Sum(ArrayList<String> stringArrayList){
        this.stringArrayList = stringArrayList;
    }

    public int sum() {
        return stringArrayList.size();
    }
}
