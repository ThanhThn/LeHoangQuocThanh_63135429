package behavioral.chainOfResponsibility.BT1;

public class ChuoiMenhGiaVND extends ChuoiMenhGiaFactory{
    ATM k500 = new MenhGiaATM(500);
    ATM k100 = new MenhGiaATM(100);
    ATM k50 = new MenhGiaATM(50);
    ATM k10 = new MenhGiaATM(10);
    ATM k1 = new MenhGiaATM(1);
    public ChuoiMenhGiaVND() {
        k500.menhGiaThapHon(k100).menhGiaThapHon(k50).menhGiaThapHon(k10).menhGiaThapHon(k1);
    }



    @Override
    ATM getChuoiMenhGia(int menhGia) {
       switch (menhGia){
           case 500: return k500;
           case 100: return k100;
           case 50: return k50;
           case 10: return k10;
           case 1: return k1;
           default: return null;
       }
    }
}
