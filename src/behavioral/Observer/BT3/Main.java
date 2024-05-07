package behavioral.Observer.BT3;

public class Main {
    public static void main(String[] args) {
        TiGia t = new TiGiaUSD();
        NhaDauTuA a = new NhaDauTuA(t);
        NhaDauTuB b = new NhaDauTuB(t);
        a.dangKi();
        b.dangKi();
        System.out.println("Thong bao lan 1: ");
        t.notify(-1);
        a.huyDangKi();
        System.out.println("Thong bao lan 2: ");
        t.notify(3);
    }
}
