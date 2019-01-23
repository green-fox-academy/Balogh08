import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics g) {
        // Fill the canvas with a checkerboard pattern.

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {

                int colorOfRectR = (int) (Math.random() * 255);
                int colorOfRectG = (int) (Math.random() * 255);
                int colorOfRectB = (int) (Math.random() * 255);

                if(i % 2 == 0){
                    g.setColor(new Color(colorOfRectR,colorOfRectG,colorOfRectB));
                    g.fillRect((90 * j),(45 * i),45,45);
                }
                else {
                    g.setColor(new Color(colorOfRectR,colorOfRectG,colorOfRectB));
                    g.fillRect(45 + (90 * j), (45 * i), 45, 45);
                }
            }
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