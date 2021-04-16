package adapter;

import javax.swing.*;
import java.awt.*;

public class CircleShape extends Shape {

    private int r;

    public CircleShape(int x, int y, int r){
        super(x, y);
        this.r = r;
    }

    @Override
    public void boundingBox() {
        System.out.println("Circle");
        System.out.printf("Pos x : %d\nPos y : %d\nRadius : %d\n", x, y, r);
    }

    @Override
    public void draw() {
        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.GREEN);
                g.drawOval(x, y, r, r);
            }
        };
        panel.setBackground(Color.DARK_GRAY);
        generateView(panel, "Circle");
    }

}
