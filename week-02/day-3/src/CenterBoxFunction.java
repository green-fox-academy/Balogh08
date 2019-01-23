import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics g) {
        // create a square drawing function that takes 2 parameter:
        // the square size and the graphics
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.


        /*for (int i = 0; i < 3; i++) {

            int rndSize = (int) (Math.random() * 100);
            int rndRGB = (int) (Math.random() * 255);
            int startPos = 160 - rndSize / 2;

            g.setColor(new Color(rndRGB, rndRGB, rndRGB));
            g.drawRect(startPos, startPos, rndSize, rndSize);
        }*/

        int rndSize = 0;
        int startPos = 0;
        int rndRGB = 0;

        drawRectsInTheMiddle(rndSize, startPos, rndRGB, g);
    }

        public static void drawRectsInTheMiddle(int sizeOfRect, int startOfRect,int colorOfRect, Graphics g){
            for (int i = 0; i < 3; i++) {
                sizeOfRect = (int) (Math.random() * 100);
                startOfRect = 160 - sizeOfRect / 2;
                colorOfRect = (int) (Math.random() * 255);
                g.setColor(new Color(colorOfRect, colorOfRect, colorOfRect));
                g.drawRect(startOfRect, startOfRect, sizeOfRect, sizeOfRect);
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