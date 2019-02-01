package cicles;

import java.awt.*;

public class Circle {
    int x;
    int y;
    int width;
    Graphics g;
    int level;

    public Circle() {

    }

    public Circle(int x, int y, int width, Graphics g) {

        this.x = x;
        this.y = y;
        this.width = width;
        this.g = g;

    }

    public void drawOvalInOval(int x, int y, int width, Graphics g, int level) {

        if (level == 0) {
        }
        else {
            setRandomColors(g);
            g.drawOval(x,y,width,width);
            int halfOfHeightOfInDoorTriangle = (int) (((width/2 * Math.sin(Math.toRadians(60))) * Math.sqrt(3)) / 2);
            drawOvalInOval(x + width / 4, y, width /2 , g, level - 1);
            drawOvalInOval(x + width / 32, y + halfOfHeightOfInDoorTriangle, width /2 , g, level - 1);
            drawOvalInOval(x + (width / 32) * 15, y + halfOfHeightOfInDoorTriangle, width /2 , g, level - 1);
        }
    }

    public void drawRandomOvalInOval(int x, int y, int width, Graphics g, int level) {

        if (level == 0) {
        }
        else {
            setRandomColors(g);

            if(((int) (Math.random()*10)) >5) {
                width += 250;
            }


            g.drawOval(x,y,width,width);

            int halfOfHeightOfInDoorTriangle = (int) (((width/2 * Math.sin(Math.toRadians(60))) * Math.sqrt(3)) / 2);
            drawOvalInOval(x + width / 4, y, width /2 , g, level - 1);
            drawOvalInOval(x + width / 32, y + halfOfHeightOfInDoorTriangle, width /2 , g, level - 1);
            drawOvalInOval(x + (width / 32) * 15, y + halfOfHeightOfInDoorTriangle, width /2 , g, level - 1);
        }
    }

    public void setRandomColors(Graphics g) {

        int redColor = (int) (Math.random() * 255);
        int greenColor = (int) (Math.random() * 255);
        int blueColor = (int) (Math.random() * 255);

        g.setColor(new Color(redColor, greenColor, blueColor));
    }
}
