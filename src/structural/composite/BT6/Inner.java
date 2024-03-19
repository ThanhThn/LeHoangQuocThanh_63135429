package structural.composite.BT6;

import java.util.ArrayList;
import java.util.List;

public class Inner extends Node{
    Node nodeL;
    Node nodeR;
    public Inner(int data) {
        super(data);
    }

    @Override
    public void addL(Node n) {
        nodeL = n;
    }

    @Override
    public void addR(Node n) {
        nodeR = n;
    }

    @Override
    public void removeR() {
        nodeR = null;
    }

    @Override
    public void removeL() {
        nodeL = null;
    }

    @Override
    public String duyet() {

        return nodeL.duyet() + " " + data + " " + nodeR.duyet();
    }

}
