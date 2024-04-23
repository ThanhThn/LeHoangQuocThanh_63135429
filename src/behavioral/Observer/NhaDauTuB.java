package behavioral.Observer;

public class NhaDauTuB implements TiGia.TiGiaObserver {
    TiGia t;

    public NhaDauTuB(TiGia t) {
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
            System.out.println("Nha dau tu B ban ra");
        }
        else {
            System.out.println("Nha dau tu B mua vao");
        }
    }
}
