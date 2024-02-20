package BT_Java.BT4;

public class ChuyenXeNgoaiThanh extends ChuyenXe{
    String noiDen;
    int soNgayDi;

    public ChuyenXeNgoaiThanh(String hoTenTaiXe, String soXe, String maSoChuyen, int doanhThu, String noiDen, int soNgayDi) {
        super(hoTenTaiXe, soXe, maSoChuyen, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }

    @Override
    public String toString() {
        return super.toString() + "Nơi đến: " + noiDen + "\n" + "Số ngày đi: " + soNgayDi + "\n";
    }
}
