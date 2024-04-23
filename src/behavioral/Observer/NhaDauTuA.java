package behavioral.Observer;

public class NhaDauTuA implements TiGia.TiGiaObserver {
    TiGia t;

    public NhaDauTuA(TiGia t) {
        this.t = t;
    }

    public void  dangKi(){
        t.attach(this);
    }
    public void huyDangKi(){
        t.detach(this);
    }

    @Override
    public void tigiaChange(double delta) {
        if(delta < 0){
            System.out.println("Nha dau tu A mua vao");
        }
        else {
            System.out.println("Nha dau tu A ban ra");
        }
    }
}
