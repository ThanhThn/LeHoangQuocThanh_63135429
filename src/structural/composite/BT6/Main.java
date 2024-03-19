package structural.composite.BT6;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Leaft(1);
        Node node2 = new Leaft(2);
        Node node3 = new Inner(3);
        Node node4 = new Inner(4);
        Node node5 = new Leaft(5);
        node3.addR(node1);
        node3.addL(node2);
        node4.addR(node3);
        node4.addL(node5);
        System.out.println(node4.duyet());
    }
}
