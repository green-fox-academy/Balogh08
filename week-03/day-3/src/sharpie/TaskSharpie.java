package sharpie;

public class TaskSharpie {
    public static void main(String[] args) {
        Sharpie pen = new Sharpie("blue",2.5);

        System.out.println(pen.inkAmount);
        System.out.println(pen.color);
        System.out.println(pen.width);
        System.out.println("------------------");

        pen.use();

        System.out.println(pen.inkAmount);
        System.out.println(pen.color);
        System.out.println(pen.width);
    }
}
