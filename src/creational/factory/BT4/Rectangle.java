package creational.factory.BT4;

public class Rectangle extends Shape{
    private static Rectangle rectangle;

    private Rectangle(){}

    public static Rectangle getInstance(){
        if(rectangle == null){
            rectangle = new Rectangle();
        }
        return rectangle;
    }

    @Override
    public String draw() {
        return brush + "\t" + paper + "\t" + frame;
    }
}
