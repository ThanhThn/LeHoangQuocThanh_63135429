package behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class TiGia {

    List<TiGiaObserver> observers = new ArrayList<TiGiaObserver>();

    public void attach(TiGiaObserver observer){
        observers.add(observer);
    }
    public void  detach(TiGiaObserver observer){
        observers.remove(observer);
    }

    public abstract void notify(double delta);


    public static interface TiGiaObserver{
        public void tigiaChange(double delta);
    }
}
