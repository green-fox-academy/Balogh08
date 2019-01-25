import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static java.lang.StrictMath.round;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles2 {

    public static void mainDraw(Graphics g) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me how many rows should the triangle contain!");

        int numberOfRows = scanner.nextInt();
        int halfOfCanvas = WIDTH/2;

        double heightOfTriangle = (Math.round(Math.sqrt(3) * 6));
        int intHeightOfTriangle = (int)heightOfTriangle;

        for (int rowIndex = 0; rowIndex < numberOfRows; rowIndex++) {
            int[] x = {halfOfCanvas - 6, halfOfCanvas, halfOfCanvas + 6};
            int[] y = {50, 50 - intHeightOfTriangle, 50};

            drawTriangle(x, y, x.length, rowIndex, g);
        }
    }

    public static void drawTriangle(int[] x, int[] y, int lengthOfArray, int rowIndex, Graphics g){

        for (int j = 0; j < lengthOfArray; j++) {
            x[j] -= 6 * rowIndex;
            y[j] += 10 * rowIndex;
        }

        int widthOfRow = rowIndex + 1;

        for (int j = 0; j < widthOfRow; j++) {
            for (int k = 0; k < lengthOfArray; k++) {
                if (j != 0) {
                    x[k] += 12;
                }
            }
            g.drawPolygon(x, y, lengthOfArray);
        }
    }


    // Don't touch the code below
    static int WIDTH = 1000;
    static int HEIGHT = 1000;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}