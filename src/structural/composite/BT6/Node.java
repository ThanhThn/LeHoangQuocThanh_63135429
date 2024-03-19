package structural.composite.BT6;

public abstract class Node {
    int data;

    public Node(int data) {
        this.data = data;
    }

    public abstract void addL(Node n);
    public abstract void addR(Node n);
    public abstract void removeL();
    public abstract void removeR();

    public abstract String duyet();
}
