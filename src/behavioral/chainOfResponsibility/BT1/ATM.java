package behavioral.chainOfResponsibility.BT1;

public abstract class ATM {
    int menhGia;
    ATM menhGiaThapHon;

    public ATM(int menhGia) {
        this.menhGia = menhGia;
    }
    public abstract ATM menhGiaThapHon(ATM m);
    public abstract String soToTien(int soTien);
}
