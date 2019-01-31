package reproducethis;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ReproduceThisDrawing {
    public static void mainDraw(Graphics g) {

        int startPointX = 20;
        int startPointY = 20;
        int widthOfRect = WIDTH - (2 * startPointX);
        int heightOfRect = HEIGHT - (2 * startPointY);

        drawRect2(startPointX,startPointY,widthOfRect,heightOfRect, g, 8);
    }

    public static void drawRect2(int x, int y, int width, int height, Graphics g, int level) {
        if (level == 1){
            g.drawRect(x,y,width,height);
        }
        else {
            g.drawRect(x,y,width,height);
            int startPointX = x;
            int startPointY =  y;
            int widthOfRect = Math.round(width/3);
            int heightOfRect = Math.round(height/3);


            drawRect2(startPointX + widthOfRect, startPointY, widthOfRect, heightOfRect, g,level - 1);
            drawRect2(startPointX, startPointY + heightOfRect, widthOfRect, heightOfRect, g,level - 1);
            drawRect2(startPointX + widthOfRect * 2, startPointY + heightOfRect, widthOfRect, heightOfRect, g,level - 1);
            drawRect2(startPointX + widthOfRect, startPointY + heightOfRect *2, widthOfRect, heightOfRect, g,level - 1);

        }




    }







    // Don't touch the code below
    // It must be 3^n + 2 * startingPoints
    static int WIDTH = 769;
    static int HEIGHT = 769;

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
            this.setBackground(Color.yellow);
        }
    }
}
