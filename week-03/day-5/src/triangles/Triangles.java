package triangles;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics g) {


        drawRecursiveEquilateralTriangle(WIDTH / 4, 0, WIDTH / 2, g, 10);
    }

    public static void drawRecursiveEquilateralTriangle(int x, int y, int width, Graphics g, int level){
        int redColor = (int) (Math.random() * 255);
        int greenColor = (int) (Math.random() * 255);
        int blueColor = (int) (Math.random() * 255);

        g.setColor(new Color(redColor, greenColor, blueColor));

        drawTriangle(x, y, width, g);
        if (level == 0) {
            drawRotatetdTriangle(0, 0, WIDTH,  g);
        }
        else {
            int heightOfRecursiveTriangle = (int) (width/2 * Math.sqrt(3));
            drawRecursiveEquilateralTriangle(x - (width / 4), y, width / 2, g, level - 1);  //left
            drawRecursiveEquilateralTriangle(x + ( 3 * (width / 4)), y, width / 2, g, level - 1);  //right
            drawRecursiveEquilateralTriangle(x + (width / 4), y + heightOfRecursiveTriangle, width / 2,  g, level - 1);  //bottom
        }
    }

    public static void drawTriangle(int x, int y, int width, Graphics g) {

        int heightOfTriangle = (int) (width/2 * Math.sqrt(3));

        int[][] coordinatesOfTriangle = new int[2][3];
        coordinatesOfTriangle[0][0] = x + width/2;
        coordinatesOfTriangle[1][0] = y;
        coordinatesOfTriangle[0][1] = x + width;
        coordinatesOfTriangle[1][1] = y + heightOfTriangle;
        coordinatesOfTriangle[0][2] = x;
        coordinatesOfTriangle[1][2] = y + heightOfTriangle;

        g.drawPolygon(coordinatesOfTriangle[0], coordinatesOfTriangle[1], coordinatesOfTriangle[0].length);
    }

    public static void drawRotatetdTriangle(int x, int y, int width, Graphics g) {

        int heightOfTriangle = (int) (width/2 * Math.sqrt(3));

        int[][] coordinatesOfTriangle = new int[2][3];
        coordinatesOfTriangle[0][0] = x;
        coordinatesOfTriangle[1][0] = y;
        coordinatesOfTriangle[0][1] = x + width;
        coordinatesOfTriangle[1][1] = y;
        coordinatesOfTriangle[0][2] = x + width / 2;
        coordinatesOfTriangle[1][2] = y + heightOfTriangle;

        g.drawPolygon(coordinatesOfTriangle[0], coordinatesOfTriangle[1], coordinatesOfTriangle[0].length);
    }

    // Don't touch the code below
    static int WIDTH = 1024;
    static int HEIGHT = 1024;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
        panel.setBackground(Color.BLACK);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
