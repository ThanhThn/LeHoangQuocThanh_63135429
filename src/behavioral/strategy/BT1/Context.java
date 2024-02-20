package behavioral.strategy.BT1;

public class Context {
    Tinh tinhToan;
    public void setTinh(Tinh tinh) {
        this.tinhToan = tinh;
    }
    public float tinh(float a, float b){
        return tinhToan.tinh(a, b);
    }
}
