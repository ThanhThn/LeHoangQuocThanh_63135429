package creational.factory.BT4;

public class Rectangle {
    private static Rectangle rectangle;

    private Rectangle(){}

    public static Rectangle getInstance(){
        if(rectangle == null){
            rectangle = new Rectangle();
        }
        return rectangle;
    }
}
