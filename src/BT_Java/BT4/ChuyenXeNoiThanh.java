package BT_Java.BT4;

public class ChuyenXeNoiThanh extends ChuyenXe{
    int soTuyen, soKm;

    public ChuyenXeNoiThanh(String hoTenTaiXe, String soXe, String maSoChuyen, int doanhThu, int soTuyen, int soKm) {
        super(hoTenTaiXe, soXe, maSoChuyen, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKm() {
        return soKm;
    }

    public void setSoKm(int soKm) {
        this.soKm = soKm;
    }

    @Override
    public String toString() {
        return super.toString() + "Số tuyến: " + soTuyen + "\n" + "Số Km đi được: " + soKm + "\n";
    }
}
