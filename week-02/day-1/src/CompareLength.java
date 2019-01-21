public class CompareLength {
    public static void main(String[] args) {
        int[] p = {1,2,3};
        int[] p2 = {4,5};
        if (p.length >= p2.length){
            System.out.println("P2 does not have more elements than p!");
        }
        else{
            System.out.println("P2 has more elements than p");
        }
    }
}
