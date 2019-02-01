package hexagon;

import java.awt.*;

public class Hexagon {

    int x;
    int y;
    int width;
    int height;
    Graphics g;
    int level;

    public Hexagon() {

    }
    public Hexagon(int x, int y, int width, int height, Graphics g, int level) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.g = g;
        this.level = level;
    }

    public void drawHexagonFractal(int x, int y, int width, int height, Graphics g, int level){

        setRandomColors(g);
        drawHexagon(x, y, width, height, g);

        int oneSixthOfWidth = width / 6;
        int oneThirdOfWidth = width / 3;
        int oneThirdOfHeight = height / 3;


        if (level == 0) {
        }
        else{

            drawHexagonFractal(x + oneSixthOfWidth, y, oneThirdOfWidth, oneThirdOfHeight, g, level - 1);
            drawHexagonFractal(x + 3* oneSixthOfWidth, y, oneThirdOfWidth, oneThirdOfHeight, g, level - 1);
            drawHexagonFractal(x, y + oneThirdOfHeight, oneThirdOfWidth, oneThirdOfHeight, g, level - 1);
            drawHexagonFractal(x + 4 * oneSixthOfWidth, y + oneThirdOfHeight, oneThirdOfWidth, oneThirdOfHeight, g, level - 1);
            drawHexagonFractal(x + oneSixthOfWidth, y + 2 * oneThirdOfHeight, oneThirdOfWidth, oneThirdOfHeight, g, level - 1);
            drawHexagonFractal(x + 3 * oneSixthOfWidth, y + 2 * oneThirdOfHeight, oneThirdOfWidth, oneThirdOfHeight, g, level - 1);

        }
    }

    public void drawHexagon(int x, int y, int width, int height, Graphics g){
        int[][] coordinatesOfHexagon = hexagonCordinates(x, y, width, height);
        g.drawPolygon(coordinatesOfHexagon[0], coordinatesOfHexagon[1], coordinatesOfHexagon[0].length);

    }

    public int[][] hexagonCordinates(int x, int y, int width, int height){
        int[][] coordinatesOfHexagon = new int[2][6];
        coordinatesOfHexagon[0][0] = x + width/4;
        coordinatesOfHexagon[1][0] = y;
        coordinatesOfHexagon[0][1] = x + (3 * width/4);
        coordinatesOfHexagon[1][1] = y;
        coordinatesOfHexagon[0][2] = x + width;
        coordinatesOfHexagon[1][2] = y + height/2;
        coordinatesOfHexagon[0][3] = x + (3 * width/4);
        coordinatesOfHexagon[1][3] = y + height;
        coordinatesOfHexagon[0][4] = x + width/4;
        coordinatesOfHexagon[1][4] = y + height;
        coordinatesOfHexagon[0][5] = x;
        coordinatesOfHexagon[1][5] = y + height/2;

        return coordinatesOfHexagon;
    }

    public void setRandomColors(Graphics g) {

        int redColor = (int) (Math.random() * 255);
        int greenColor = (int) (Math.random() * 255);
        int blueColor = (int) (Math.random() * 255);

        g.setColor(new Color(redColor, greenColor, blueColor));
    }




}
