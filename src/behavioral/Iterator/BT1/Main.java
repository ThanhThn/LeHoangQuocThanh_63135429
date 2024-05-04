package behavioral.Iterator.BT1;

public class Main {
    public static void main(String[] args) {
        ArrayObject63 array = new ArrayObject63(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        Iterator63 iterator63 = array.createIterator63();
        while (!iterator63.isDone()){
            Object item = iterator63.next();
            System.out.println(item);
        }
    }
}
