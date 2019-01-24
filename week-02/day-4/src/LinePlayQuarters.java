import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

    public static void mainDraw(Graphics g){

        g.setColor(Color.black);
        g.fillRect(1,1,WIDTH,HEIGHT);

        Scanner num = new Scanner(System.in);

        System.out.println("Give me a number, please!");
        int divBy = num.nextInt();

        for (int i = 0; i < divBy; i++) {
            for (int j = 0; j < divBy; j++) {
                for (int k = 0; k < WIDTH/20 - 1; k++) {
            g.setColor(new Color(153,50,204));
            g.drawLine(((20 / divBy)*(k + 1)) + ((320 / divBy) * j),((320 / divBy) * i),((320/divBy)*(j+1)),((k +1) * (20 / divBy)) + ((320/divBy)*i));
            g.setColor(Color.green);
            g.drawLine(((320 / divBy) * i),((20 / divBy)*(k + 1)) + ((320 / divBy) * j),(k +1) * (20 / divBy) + ((320/divBy)*i),((320/divBy)*(j+1)));
                }

            }

        }

/*        for (int i = 0; i < WIDTH/20 - 2; i++) {
            g.setColor(new Color(153,50,204));
            g.drawLine(20 * (i + 2),0,320,(i +1) * 20);
            g.setColor(Color.green);
            g.drawLine(0,20 * (i + 2),20 * (i + 1),320);
        }*/
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