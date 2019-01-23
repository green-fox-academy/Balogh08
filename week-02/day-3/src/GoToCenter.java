import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics g) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.

        Scanner coordinate = new Scanner(System.in);
        System.out.println("Give me a parameter for x, please!");
        int xValue = coordinate.nextInt();

        System.out.println("Give me a parameter for y, please!");
        int yValue = coordinate.nextInt();

        System.out.println("Give me a parameter for color, please! Number should not be  more than 105");
        int colorValue = coordinate.nextInt();

        for (int i = 0; i < 101; i += 50) {

            g.setColor(new Color(100 + colorValue, i + colorValue, 100 + colorValue));
            g.drawLine(xValue + i, yValue, 160, 160);
        }


    }

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