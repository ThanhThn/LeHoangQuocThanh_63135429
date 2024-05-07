package behavioral.Observer.BT1;

import java.util.ArrayList;
import java.util.List;

public class MyStream<T>{
    List<MyStreamListener> listeners;

    public MyStream() {
        this.listeners = new ArrayList<>();
    }

    public void addListener(MyStreamListener l){
        listeners.add(l);
    }

    public void addEvent(T event){
        for(MyStreamListener l : listeners){
            l.listen(event);
        }
    }
}
