package behavioral.Iterator.BT1;

public class ArrayIterator63 implements Iterator63 {
    ArrayObject63 object63;
    int index = -1;
    protected ArrayIterator63(ArrayObject63 object63) {
        this.object63 = object63;
    }

    @Override
    public Object next() {
        if (!isDone()) {
            return object63.getItem(++index);
        }
        return  null;
    }


    @Override
    public Object currentItem() {
        return object63.getItem(index);

    }

    @Override
    public boolean isDone() {
        return index == object63.count() - 1;
    }

    @Override
    public Object first() {
        if (object63.count() > 0) return object63.getItem(0);
        return null;
    }
}
