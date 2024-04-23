package behavioral.chainOfResponsibility.BT3;

public class MucDien extends Electricity{
    public MucDien(int giaDien, String tenBac, int mucTieuThuMin, int mucTieuThuMax) {
        super(giaDien, tenBac, mucTieuThuMin, mucTieuThuMax);
    }

    @Override
    public Electricity mucDienCaoHon(Electricity e) {
        this.mucDienCaoHon = e;
        return e;
    }

    @Override
    public int tienDien(int luongSuDung) {
        if(luongSuDung <= mucTieuThuMax){
            return (luongSuDung - mucTieuThuMin) * giaDien;
        }else{
            return (mucTieuThuMax - mucTieuThuMin) * giaDien + mucDienCaoHon.tienDien(luongSuDung);
        }
    }

    @Override
    public String tienDienCuaBac(int luongSuDung) {
        StringBuilder builder = new StringBuilder(tenBac).append(": ");
        if(luongSuDung <= mucTieuThuMax){
            builder.append(tienDien(luongSuDung));
        }else {
            builder.append((mucTieuThuMax - mucTieuThuMin) * giaDien).append("\n");
            builder.append(mucDienCaoHon.tienDienCuaBac(luongSuDung));
        }
        return builder.toString();
    }
}
