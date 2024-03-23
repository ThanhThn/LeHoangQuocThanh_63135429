package creational.factory.BT4;

public class Circle extends Shape {
    private static Circle circle;

    private Circle(){}

    public static Circle getInstance(){
        if(circle == null){
            circle = new Circle();
        }
        return circle;
    }

    @Override
    public String draw() {
        return null;
    }
}
