package behavioral.chainOfResponsibility.BT3;

public class MucDienCaoNhat extends Electricity{


    public MucDienCaoNhat(int giaDien, String tenBac, int mucTieuThuMin, int mucTieuThuMax) {
        super(giaDien, tenBac, mucTieuThuMin, mucTieuThuMax);
    }

    @Override
    public Electricity mucDienCaoHon(Electricity e) {
        return null;
    }

    @Override
    public int tienDien(int luongSuDung) {
        return (luongSuDung - mucTieuThuMin) * giaDien;
    }

    @Override
    public String tienDienCuaBac(int luongSuDung) {
        StringBuilder builder = new StringBuilder(tenBac).append(": ");
        builder.append(tienDienCuaBac(luongSuDung));
        return builder.toString();
    }


}
