public class Anagram {
    public static void main(String[] args) {
        System.out.println(anagram("kika", "kaik"));
    }

    public static boolean anagram(String a, String b){
        boolean anagramValue = false;
        if(a.length() != b.length()){
            anagramValue = false;
            return anagramValue;
        }

        for (int i = 0; i < a.length(); i++) {
            if(a.contains(Character.toString(b.charAt(i)))){
                anagramValue = true;
            }
            else{
                anagramValue = false;
            }
        }
        return anagramValue;
    }
}
