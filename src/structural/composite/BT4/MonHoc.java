package structural.composite.BT4;

public class MonHoc extends KHHT{
    int hocPhi, soTC;

    public MonHoc(String ten, int hocPhi, int soTC) {
        super(ten);
        this.hocPhi = hocPhi;
        this.soTC = soTC;
    }

    @Override
    public void Add(KHHT k) {}

    @Override
    public void Remove(KHHT k) {}

    @Override
    public int HocPhi() {
        return soTC * hocPhi;
    }

    @Override
    public int TinChi() {
        return soTC;
    }

    @Override
    public String ThongTin() {
        return getStringTab() + "Tên Môn Học: " + ten + "| Số tín chỉ: " + soTC + "| Học phí: " + HocPhi() + "\n";
    }
}
