import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics g) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.


        int xValue = 30;
        int yValue = 10;

        drawLinesToCenter(xValue, yValue, g);
    }

    public static void drawLinesToCenter(int x, int y, Graphics g) {

        g.setColor(Color.red);
        g.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
        g.setColor(Color.black);
        for (int i = 0; i < 17; i++) {
            g.drawLine(20 * i, 0, WIDTH / 2, HEIGHT / 2);
            g.drawLine(0, 20 * i, WIDTH / 2, HEIGHT / 2);
            g.drawLine(20 * i, 320, WIDTH / 2, HEIGHT / 2);
            g.drawLine(320, 20 * i, WIDTH / 2, HEIGHT / 2);
        }
    }
        /*g.drawLine(0,0,160,160);
        g.drawLine(20,0,160,160);
        g.drawLine(40,0,160,160);
        g.drawLine(60,0,160,160);*/




    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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