package behavioral.Observer;

public class TiGiaUSD extends TiGia{
    @Override
    public void notify(double delta){
        for(TiGiaObserver observer: observers){
            observer.tigiaChange(delta);
        }
    }
}
