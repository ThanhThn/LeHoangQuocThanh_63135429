package behavioral.chainOfResponsibility.BT1;

public abstract class ChuoiMenhGiaFactory{
    abstract ATM getChuoiMenhGia(int menhGia);
    void rutTien(int soTien, int menhGiaCaoNhat){
        System.out.println(getChuoiMenhGia(menhGiaCaoNhat).soToTien(soTien));
    }
}
