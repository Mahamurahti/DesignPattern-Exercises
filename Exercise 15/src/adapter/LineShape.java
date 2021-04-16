package adapter;

import javax.swing.*;
import java.awt.*;

public class LineShape extends Shape {

    private int w;

    public LineShape(int x, int y, int w){
        super(x, y);
        this.w = w;
    }

    @Override
    public void boundingBox() {
        System.out.println("Line:");
        System.out.printf("Pos x : %d\nPos y : %d\nWidth : %d\n", x, y, w);
    }

    @Override
    public void draw() {
        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.RED);
                g.drawLine(x, y, x + w, y);
            }
        };
        panel.setBackground(Color.DARK_GRAY);
        generateView(panel, "Line");
    }

}
