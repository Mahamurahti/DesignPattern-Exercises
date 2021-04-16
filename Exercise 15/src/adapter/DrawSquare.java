package adapter;

import java.awt.*;

public class DrawSquare {

    // Legacy class (Adaptee)
    private int xCoordinate, yCoordinate;
    private int width, height;

    public DrawSquare(int xCoord, int yCoord, int width, int height){
        xCoordinate = xCoord;
        yCoordinate = yCoord;
        this.width = width;
        this.height = height;
    }

    public void drawLeftLine(Graphics g){
        g.drawLine(xCoordinate, yCoordinate, xCoordinate, yCoordinate + height);
    }

    public void drawRightLine(Graphics g){
        g.drawLine(xCoordinate + width, yCoordinate, xCoordinate + width, yCoordinate + height);
    }

    public void drawTopLine(Graphics g){
        g.drawLine(xCoordinate, yCoordinate, xCoordinate + width, yCoordinate);
    }

    public void drawBottomLine(Graphics g){
        g.drawLine(xCoordinate, yCoordinate + height, xCoordinate + width, yCoordinate + height);
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
