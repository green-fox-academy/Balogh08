package hexagon;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawHexagons {
    public static void mainDraw(Graphics g) {
        Hexagon myHexagon = new Hexagon();
        myHexagon.drawHexagonFractal(0, 0, WIDTH, HEIGHT, g, 5);
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
