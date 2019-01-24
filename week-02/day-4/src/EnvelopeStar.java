import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

    public static void mainDraw(Graphics g){

        g.setColor(Color.black);
        g.fillRect(1,1,WIDTH,HEIGHT);
        g.setColor(Color.green);

        for (int i = 0; i < 160/10; i++) {
            g.drawLine(10 * (i + 1),160,160,150 - (i * 10));
        }

        for (int i = 0; i < 160/10; i++) {
            g.drawLine(160,10 * (i),160 + (10 * i),160);
        }

        for (int i = 0; i < 160/10; i++) {
            g.drawLine(10 * (i + 1),160,160,170 + (i * 10));
        }

        for (int i = 0; i < 160/10; i++) {
            g.drawLine(160,320 - (10 * i),160 + (10 * i),160);
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