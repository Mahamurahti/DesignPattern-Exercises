package adapter;

public class Main {
    public static void main(String[] args){
        Shape shape = new LineShape(50, 50, 100);
        shape.boundingBox();
        shape.draw();
        shape = new CircleShape(90, 70, 200);
        shape.boundingBox();
        shape.draw();
        shape = new RectangleShape(20, 20, 200, 200);
        shape.boundingBox();
        shape.draw();
    }
}
