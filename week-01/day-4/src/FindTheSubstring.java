public class FindTheSubstring {
    public static void main(String[] args) {

        String str1 = "Ez rövidebb kód lett mint gondoltam volna.";
        String str2 = "mint";

        System.out.println(str1.lastIndexOf(str2));
    }
}
