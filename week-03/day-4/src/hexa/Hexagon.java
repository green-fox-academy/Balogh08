package hexa;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {
    public static void mainDraw(Graphics g){
        drawHexagonRecursive(0, 0, WIDTH, HEIGHT, g, 3);
    }

    public static void drawHexagonRecursive(int x, int y, int width, int height, Graphics g, int level){
        int redColor = (int) (Math.random() * 255);
        int greenColor = (int) (Math.random() * 255);
        int blueColor = (int) (Math.random() * 255);

        g.setColor(new Color(redColor, greenColor, blueColor));
        drawHexagon(x, y, width, height, g);

        if (level == 0) {
        }
        else{

            drawHexagonRecursive(x + width/8, y, width/2, height/2, g, level - 1);
            drawHexagonRecursive(x + width/8, y + height/2, width/2, height/2, g, level - 1);
            drawHexagonRecursive(x + (4 * width/8), y + height/4, width/2, height/2, g, level - 1);

        }
    }

    public static void drawHexagon(int x, int y, int width, int height, Graphics g){
        int[][] coordinatesOfHexagon = hexagonCordinates(x, y, width, height);
        g.drawPolygon(coordinatesOfHexagon[0], coordinatesOfHexagon[1], coordinatesOfHexagon[0].length);

    }

    public static int[][] hexagonCordinates(int x, int y, int width, int height){
        int[][] coordinatesOfHexagon = new int[2][6];
        coordinatesOfHexagon[0][0] = x + width/4;
        coordinatesOfHexagon[1][0] = y;
        coordinatesOfHexagon[0][1] = x + (3 * width/4);
        coordinatesOfHexagon[1][1] = y;
        coordinatesOfHexagon[0][2] = x + width;
        coordinatesOfHexagon[1][2] = y + height/2;
        coordinatesOfHexagon[0][3] = x + (3 * width/4);
        coordinatesOfHexagon[1][3] = y + height;
        coordinatesOfHexagon[0][4] = x + width/4;
        coordinatesOfHexagon[1][4] = y + height;
        coordinatesOfHexagon[0][5] = x;
        coordinatesOfHexagon[1][5] = y + height/2;

        return coordinatesOfHexagon;
    }


    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
        panel.setBackground(Color.WHITE);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
            this.setBackground(Color.black);
        }
    }

}
