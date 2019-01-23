import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics g) {
        // Create a function that takes 2 parameters:
        // An array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

        int[][] x = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
        int[][] y = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};

        greenFox(x, y, g);
        }

    public static void greenFox(int[][] x, int[][] y, Graphics g) {

        g.setColor(Color.green);
        int nOfX = x.length;
        int[] xi = new int[nOfX];
        int[] xj = new int[nOfX];
        for (int i = 0; i < nOfX; i++) {
            xi[i] = x[i][0];
            xj[i]= x[i][1];
        }
        g.drawPolygon(xi, xj, nOfX);

        int nOfY = y.length;
        int[] yi = new int[nOfY];
        int[] yj = new int[nOfY];
        for (int i = 0; i <nOfY ; i++) {
            yi[i] = y[i][0];
            yj[i]= y[i][1];
        }
        g.drawPolygon(yi, yj, nOfY);






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

        /*int[] x = {10, 290, 290, 10};
        int[] y = {10, 10, 290, 290};
        int n = x.length;
        g.drawPolygon(x,y,n);

        int[] x2 = {50, 70, 80, 90, 100, 120, 85, 50};
        int[] y2 = {100, 70, 90, 90, 70, 100, 130, 100};
        int n2 = x2.length;
        g.drawPolygon(x2,y2,n2);*/