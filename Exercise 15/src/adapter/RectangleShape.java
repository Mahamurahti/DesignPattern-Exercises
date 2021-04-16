package adapter;

import javax.swing.*;
import java.awt.*;

public class RectangleShape extends Shape {

    // Adapter: uses the DrawSquare class to complete its task
    // Object adapter
    private DrawSquare ds;

    public RectangleShape(int x, int y, int w, int h){
        super(x, y);
        ds = new DrawSquare(x, y, w, h);
    }

    @Override
    public void boundingBox() {
        System.out.println("Rectangle:");
        System.out.printf("Pos x : %d\nPos y : %d\nWidth : %d\nHeight : %d\n",
                ds.getxCoordinate(), ds.getyCoordinate(), ds.getWidth(), ds.getHeight());
    }

    @Override
    public void draw() {
        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.YELLOW);
                ds.drawLeftLine(g);
                ds.drawRightLine(g);
                ds.drawBottomLine(g);
                ds.drawTopLine(g);
            }
        };
        panel.setBackground(Color.DARK_GRAY);
        generateView(panel, "Rectangle");
    }

}
