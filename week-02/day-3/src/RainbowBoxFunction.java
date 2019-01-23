import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics g) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        /*int rndSize = (int)(Math.random()*300);
        int rndRGB = (int)(Math.random()*255);
        int*/

        int rndSize = (int) (Math.random() * 300);

        rainbowFunction(rndSize, g);
    }
    public static void rainbowFunction(int sizeOfRect, Graphics g){

        for (int i = 0; i < 7; i++) {

            sizeOfRect -= 10;
            int colorOfRectR = (int) (Math.random() * 255);
            int colorOfRectG = (int) (Math.random() * 255);
            int colorOfRectB = (int) (Math.random() * 255);
            int posOfRect = 160 - sizeOfRect / 2;

            g.setColor(new Color(colorOfRectR, colorOfRectG, colorOfRectB));
            g.fillRect(posOfRect, posOfRect, sizeOfRect, sizeOfRect);
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
