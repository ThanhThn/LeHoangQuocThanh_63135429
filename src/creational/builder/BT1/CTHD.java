package creational.builder.BT1;

public class CTHD {
    private String sanPham;
    private int soLuong, donGia, chietKhau;

    public CTHD(String sanPham, int soLuong, int donGia, int chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }
    @Override
    public String toString() {
        return "Sản phẩm: " + sanPham + " | " +
                "Số lượng: " + soLuong + " | " +
                "Đơn giá: " + donGia + " | " +
                "Chiết khấu: " + chietKhau + " |\n";
    }
}
