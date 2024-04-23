package behavioral.chainOfResponsibility.BT1;

public class MenhGiaATM extends ATM{
    public MenhGiaATM(int menhGia) {
        super(menhGia);
    }

    @Override
    public ATM menhGiaThapHon(ATM m) {
        if(menhGia == 1){
            return null;
        }
        this.menhGiaThapHon = m;
        return m;
    }

    @Override
    public String soToTien(int soTien) {
        StringBuilder builder = new StringBuilder();
        int soToTien = soTien / menhGia;
        if(soToTien != 0){
            builder.append(soToTien).append(" to ").append(menhGia).append(" ngan").append("\n");
        }
        int tienThua = soTien - (soToTien * menhGia);
        if (this.menhGiaThapHon == null){
            return builder.toString();
        }
        builder.append(menhGiaThapHon.soToTien(tienThua));
        return builder.toString();
    }
}
