package triangles;

import java.awt.*;

import static triangles.DrawTriangles.WIDTH;

public class Triangle {

    int x;
    int y;
    int width;
    Graphics g;

    public Triangle() {

    }

    public Triangle(int x, int y, int width, Graphics g) {

        this.x = x;
        this.y = y;
        this.width = width;
        this.g = g;
    }

    public void drawTriangle(){

        int heightOfTriangle = (int) (width/2 * Math.sqrt(3));

        int[][] coordinatesOfTriangle = new int[2][3];
        coordinatesOfTriangle[0][0] = x + width/2;
        coordinatesOfTriangle[1][0] = y;
        coordinatesOfTriangle[0][1] = x + width;
        coordinatesOfTriangle[1][1] = y + heightOfTriangle;
        coordinatesOfTriangle[0][2] = x;
        coordinatesOfTriangle[1][2] = y + heightOfTriangle;

        g.drawPolygon(coordinatesOfTriangle[0], coordinatesOfTriangle[1], coordinatesOfTriangle[0].length);
    }

    public void drawRotatetdTriangle( int x, int y, int width, Graphics g){

        int heightOfTriangle = (int) (width * Math.sqrt(3));
        int widhtOfRotatedTriangle = width * 2;

        int[][] coordinatesOfTriangle = new int[2][3];
        coordinatesOfTriangle[0][0] = x - widhtOfRotatedTriangle / 4;
        coordinatesOfTriangle[1][0] = y;
        coordinatesOfTriangle[0][1] = x + widhtOfRotatedTriangle / 4 * 3 ;
        coordinatesOfTriangle[1][1] = y;
        coordinatesOfTriangle[0][2] = x + widhtOfRotatedTriangle / 4;
        coordinatesOfTriangle[1][2] = y + heightOfTriangle;

        g.drawPolygon(coordinatesOfTriangle[0], coordinatesOfTriangle[1], coordinatesOfTriangle[0].length);
    }

    public  void drawRecursiveTriangle(int x, int y, int width, Graphics g, int level) {
        Triangle myTriangle = new Triangle(x, y, width, g);
        myTriangle.setRandomColors(g);
        myTriangle.drawTriangle();

        if (level == 0) {
        }
        else {
            int heightOfRecursiveTriangle = (int) (width/2 * Math.sqrt(3));
            drawRecursiveTriangle(x - (width / 4), y, width / 2, g, level - 1);  //left
            drawRecursiveTriangle(x + ( 3 * (width / 4)), y, width / 2, g, level - 1);  //right
            drawRecursiveTriangle(x + (width / 4), y + heightOfRecursiveTriangle, width / 2,  g, level - 1);  //bottom
        }

    }

    public void setRandomColors(Graphics g) {

        int redColor = (int) (Math.random() * 255);
        int greenColor = (int) (Math.random() * 255);
        int blueColor = (int) (Math.random() * 255);

        g.setColor(new Color(redColor, greenColor, blueColor));
    }

}
