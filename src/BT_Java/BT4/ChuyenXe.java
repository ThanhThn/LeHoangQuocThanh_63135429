package BT_Java.BT4;

public abstract class ChuyenXe {
    String hoTenTaiXe, soXe, maSoChuyen;
    int doanhThu;

    public ChuyenXe(String hoTenTaiXe, String soXe, String maSoChuyen, int doanhThu) {
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.maSoChuyen = maSoChuyen;
        this.doanhThu = doanhThu;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public int getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }

    @Override
    public String toString() {
        return "Mã số chuyến: " + maSoChuyen + "\n" + "Tài xế: " + hoTenTaiXe + "\n" + "Số xe: " + soXe + "\n" + "Doanh thu: " + doanhThu + "\n";
    }
}
