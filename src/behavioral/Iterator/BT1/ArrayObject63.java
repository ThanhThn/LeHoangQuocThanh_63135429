package behavioral.Iterator.BT1;

public class ArrayObject63 extends Object63 {
    int[] arr;

    public ArrayObject63(int[] arr) {
        this.arr = arr;
    }

    public int getItem(int i){
        return arr[i];
    }

    public int count(){
        return arr.length;
    }
    @Override
    Iterator63 createIterator63() {
        return new ArrayIterator63(this);
    }
}
