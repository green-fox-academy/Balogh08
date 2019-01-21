public class AppendAFunction {
    public static void main(String[] args) {
        String typo = "Chinchill";
        typo = appendAFunc(typo);
        System.out.println(typo);

    }
        public static String appendAFunc(String userVariable){
            userVariable = userVariable + "a";
            return userVariable;
        }
}
