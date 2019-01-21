import java.awt.*;

public class Colors {
    public static void main(String[] args) {
        String[][] colors = new String[3][5];
        colors[0][0] = "lime";
        colors[0][1] = "forest green";
        colors[0][2] = "olive";
        colors[0][3] = "pale green";
        colors[0][4] = "spring green";
        colors[1][0] = "orange red";
        colors[1][1] = "red";
        colors[1][2] = "tomato";
        colors[2][0] = "orchid";
        colors[2][1] = "violet";
        colors[2][2] = "pink";
        colors[2][3] = "hot pink";

        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                if(colors[i][j] == null) {
                    System.out.print("");
                }
                else{
                    System.out.print(colors[i][j] + ", ");
                }
            }
            System.out.println("");
        }

    }
}
