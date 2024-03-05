package BT_Java.BT5;

public class GiaoVien extends CaNhan{
    String monDay, toBoMon;

    public GiaoVien(String hoTen, String diaChi, String sdt, int tuoi, String monDay, String toBoMon) {
        super(hoTen, diaChi, sdt, tuoi);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    @Override
    public String hienThiTT() {
        return "Họ tên: " + hoTen + " | Môn dạy: " + monDay + " | Tuổi: " + tuoi + " | Địa chỉ: " + diaChi + " | Tổ bộ môn: " + toBoMon + " | Số điện thoại: " + sdt ;
    }
}
