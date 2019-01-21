public class Factorio {
    public static void main(String[] args) {
        int num1 = 3;
        System.out.println(factorio(num1));
    }

    public static int factorio(int userNum){
        int holder = 1;
        for (int i = 0; i < userNum; i++) {
                holder = holder * (i + 1);
        }
        return holder;
    }
}
