import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

    public static void mainDraw(Graphics g){

        g.setColor(Color.black);
        g.fillRect(1,1,WIDTH,HEIGHT);

            for (int i = 0; i < WIDTH/20 - 2; i++) {
                g.setColor(new Color(153,50,204));
                g.drawLine(20 * (i + 2),0,320,(i +1) * 20);
                g.setColor(Color.green);
                g.drawLine(0,20 * (i + 2),20 * (i + 1),320);
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