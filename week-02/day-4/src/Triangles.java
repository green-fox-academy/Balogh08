import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void mainDraw(Graphics g) {


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                int[] x = {150, 156, 162};
                int[] y = {12, 2, 12};

                int middleOfTriangle = i / 2;

                if (j < middleOfTriangle) {
                    for (int k = 0; k < x.length; k++) {
                        x[k] -= 6 * (i + j);
                        y[k] += 10 * (i + j);

                    }
                } else if (j > middleOfTriangle) {
                    for (int k = 0; k < x.length; k++) {
                        x[k] += 6 * (i + j);
                        y[k] += 10 * (i + j);
                    }
                } else {
                    for (int k = 0; k < x.length; k++) {
                        y[k] += 10 * (i) ;
                    }
                }
                g.drawPolygon(x, y, 3);
            }
        }
    }

       /* int x1 = 100;
        int x2 = 110;
        int y = 100;
        int addToLine = 5;
        int addToHeight = 9;

        for (int i = 0; i < 16; i++) {

            x1 -= addToLine;
            x2 += addToLine;
            y += addToHeight;

            g.drawLine(x1,y,x2,y);
        }
*/


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