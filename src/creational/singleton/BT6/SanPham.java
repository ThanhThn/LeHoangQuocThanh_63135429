package creational.singleton.BT6;

public class SanPham {
    String maSanPham, tenSanPham;
    int soLuong, donGia;

    public SanPham(String maSanPham, String tenSanPham, int soLuong, int donGia) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Mã sản phẩm: ").append(maSanPham).append("\n");
        builder.append("Tên sản phẩm: ").append(tenSanPham).append("\n");
        builder.append("Số lương: ").append(soLuong).append("\n");
        builder.append("Đơn giá: ").append(donGia).append("\n");
        return builder.toString();
    }
}
