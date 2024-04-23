package behavioral.chainOfResponsibility.BT3;

public abstract class Electricity {
    int giaDien;
    String tenBac;
    int mucTieuThuMin, mucTieuThuMax;
    Electricity mucDienCaoHon;

    public Electricity(int giaDien, String tenBac, int mucTieuThuMin, int mucTieuThuMax) {
        this.giaDien = giaDien;
        this.tenBac = tenBac;
        this.mucTieuThuMin = mucTieuThuMin;
        this.mucTieuThuMax = mucTieuThuMax;
    }

    public abstract Electricity mucDienCaoHon(Electricity e);
    public abstract int tienDien(int luongSuDung);
    public abstract String tienDienCuaBac(int luongSuDung);
}
