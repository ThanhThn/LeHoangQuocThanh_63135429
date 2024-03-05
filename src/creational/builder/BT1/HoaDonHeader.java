package creational.builder.BT1;

public class HoaDonHeader {
    private String maHoaDon, ngayBan, tenKhachHang;

    public HoaDonHeader(String maHoaDon, String ngayBan, String tenKhachHang) {
        this.maHoaDon = maHoaDon;
        this.ngayBan = ngayBan;
        this.tenKhachHang = tenKhachHang;
    }

    @Override
    public String toString() {
        return "Mã hóa đơn: " + maHoaDon + " | " +
                "Ngày bán: " + ngayBan + " | " +
                "Tên khách hàng: " + tenKhachHang + "| ";
    }
}
