public class DrawChessTable {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if(i % 2 == 0 && j % 2 == 0){
                    System.out.print("X");
                }
                else if (i % 2 == 1 && j % 2 == 1){
                    System.out.print("X");
                }
                else{
                    System.out.print("O");
                }
            }
            System.out.println("");
        }
    }
}
