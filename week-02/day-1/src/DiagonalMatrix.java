public class DiagonalMatrix {
    public static void main(String[] args) {
        int[][] numbers = new int[4][4];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i == j){
                    numbers[i][j] = 1;
                    System.out.print(numbers[i][j]);
                }
                else{
                    numbers[i][j] = 0;
                    System.out.print(numbers[i][j]);
                }
            }
            System.out.println("");
        }
    }
}
