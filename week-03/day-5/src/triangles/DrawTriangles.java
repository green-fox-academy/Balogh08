package triangles;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawTriangles {
    public static void mainDraw(Graphics g) {

        //Triangle.drawRecursiveTriangle(WIDTH / 4, 0, WIDTH / 2, g, 10);
        //Triangle.drawRecursiveTriangle(500, 500, 200, g, 3 );
        Triangle myTriangle = new Triangle();
        myTriangle.drawRecursiveTriangle(150, 50, 200, g, 8);
        myTriangle.drawRotatetdTriangle(150, 50, 200, g);
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
