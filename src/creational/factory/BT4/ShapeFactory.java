package creational.factory.BT4;

public class ShapeFactory {
    public Shape createShape(ShapeType shapeType){
        switch (shapeType){
            case CIRCLE -> {
                return Circle.getInstance();
            }
            case TRIANGLE -> {
                return Triangle.getInstance();
            }
            case RECTANGLE -> {
                return Rectangle.getInstance();
            }
        }
        return null;
    }
}