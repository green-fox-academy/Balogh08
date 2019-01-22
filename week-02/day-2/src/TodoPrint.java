public class TodoPrint {
    public static void main(String... args) {
        String todoText = " - Buy milk\n";
        todoText = "My todo:\n" + todoText;
        todoText = todoText + " - Download games\n";
        todoText = todoText + "\t- Diablo";
        System.out.println(todoText);
    }
}
