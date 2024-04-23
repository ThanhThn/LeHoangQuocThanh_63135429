package behavioral.Observer.BT5;

public class ATM {
    TaiKhoanATM theATM;

    public void nhanThe(TaiKhoanATM theATM){
        this.theATM = theATM;
    }

    public void  traThe(){
        this.theATM = null;
    }

    public void rutTien(int soTienRut){
        if (theATM != null) {
            if(theATM.kiemTraSoDu(soTienRut) ){
                theATM.nhanThongBao(soTienRut, true);
            }else theATM.nhanThongBao(soTienRut, false);
        }
    }
}
