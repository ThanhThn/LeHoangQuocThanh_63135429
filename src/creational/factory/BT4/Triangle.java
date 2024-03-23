package creational.factory.BT4;

public class Triangle  extends Shape{
    private static Triangle triangle;

    private Triangle(){}

    public static Triangle getInstance(){
        if(triangle == null){
            triangle = new Triangle();
        }
        return triangle;
    }

    @Override
    public String draw() {
        return null;
    }
}
