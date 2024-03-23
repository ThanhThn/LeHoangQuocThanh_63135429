package creational.factory.BT4;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rec1 = shapeFactory.createShape(ShapeType.RECTANGLE);
        Shape rec2  = shapeFactory.createShape(ShapeType.RECTANGLE);
        rec2.setBrush("Co 12");
        Shape rec3 = shapeFactory.createShape(ShapeType.RECTANGLE);
        rec3.setFrame("Frame 3*4");
        System.out.println(rec3.draw());
    }
}
