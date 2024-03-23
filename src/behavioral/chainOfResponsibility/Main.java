package behavioral.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        ChoVayF88 baoVe = new NhanVien("Van A", "Bao Ve", 500_000);
        ChoVayF88 nhanVien = new NhanVien("Can V" , "Nhan Vien", 2_000_000);
        ChoVayF88 truongPhong = new NhanVien("Chi C", "Truong Phong", 10_000_000);
        ChoVayF88 chuTich = new ChuTich("Nhan X", "Chu Tich", 50_000_000);
        baoVe.caoCapHon(nhanVien).caoCapHon(truongPhong).caoCapHon(chuTich);

        System.out.println(baoVe.xuLyVay(55_000_000));
    }
}
