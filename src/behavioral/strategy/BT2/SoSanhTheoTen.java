package behavioral.strategy.BT2;

public class SoSanhTheoTen implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        if (o1.hoTen.compareTo(o2.hoTen) > 0) return 1;
        if (o1.hoTen.compareTo(o2.hoTen) < 0) return -1;
        return 0;
    }
}
