package creational.factory.BT4;

public abstract class Shape {
    String brush = "", paper = "", frame = "";

    public void setBrush(String brush) {
        this.brush = brush;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public abstract String draw();
}
