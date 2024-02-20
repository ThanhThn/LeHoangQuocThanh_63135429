package BT_Java.BT4;

public class MainBT4 {
    public static void main(String[] args) {
        ChuyenXe NT1 = new ChuyenXeNoiThanh("Nguyễn Văn A", "79D1", "D1", 3000, 4, 30);
        ChuyenXe NT2 = new ChuyenXeNoiThanh("Nguyễn Văn B", "79D2", "D2", 4000, 5, 40);
        ChuyenXe NT3 = new ChuyenXeNoiThanh("Nguyễn Văn C", "79D3", "D3", 5000, 6, 50);
        ChuyenXe NgT1 = new ChuyenXeNgoaiThanh("Nguyễn Văn D", "79N1", "N1", 6000, "Cam Ranh", 1);
        ChuyenXe NgT2 = new ChuyenXeNgoaiThanh("Nguyễn Văn E", "79N2", "N2", 7000, "Phú Yên", 2);
        ChuyenXe NgT3 = new ChuyenXeNgoaiThanh("Nguyễn Văn F", "79N3", "N3", 8000, "Phan Rang", 3);
        QuanLyChuyenXe quanLyChuyenXe = new QuanLyChuyenXe();
        quanLyChuyenXe.Them(NT1);
        quanLyChuyenXe.Them(NT2);
        quanLyChuyenXe.Them(NT3);
        quanLyChuyenXe.Them(NgT1);
        quanLyChuyenXe.Them(NgT2);
        quanLyChuyenXe.Them(NgT3);

        quanLyChuyenXe.InDSChuyenXe();
        int doanhThuXeNoiThanh = quanLyChuyenXe.TongDanhThuXeNoiThanh();
        int doanhThuXeNgoaiThanh = quanLyChuyenXe.TongDanhThuXeNgoaiThanh();
        System.out.println("Tổng danh thu xe nội thành: " + doanhThuXeNoiThanh + "\n");
        System.out.println("Tổng danh thu xe ngoại thành: " + doanhThuXeNgoaiThanh + "\n");
        System.out.println("Tổng danh thu tất cả xe: " + (doanhThuXeNgoaiThanh + doanhThuXeNoiThanh)  + "\n");

    }
}
