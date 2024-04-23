package behavioral.Observer.BT5;

public class TaiKhoan implements TaiKhoanATM{
    int soDuTaiKhoan;
    ATM atm;

    public TaiKhoan(int soDuTaiKhoan, ATM atm) {
        this.soDuTaiKhoan = soDuTaiKhoan;
        this.atm = atm;
    }

    public void duaTheVaoATM(){
        atm.nhanThe(this);
    }

    public void  rutTheKhoiATM(){
        atm.traThe();
    }
    public TaiKhoan(int soDuTaiKhoan) {
        this.soDuTaiKhoan = soDuTaiKhoan;
    }

    @Override
    public boolean kiemTraSoDu(int soTienRut) {
        if(soTienRut <= soDuTaiKhoan) return true;
        return false;
    }

    @Override
    public void nhanThongBao(int soTienRut, boolean trangThai) {
        if(trangThai){
            soDuTaiKhoan = soDuTaiKhoan - soTienRut;
            System.out.println("Bạn đã rút " + soTienRut + " thành công\nSố dư tài khoản hiện tại: " + soDuTaiKhoan);
        }else {
            System.out.println("Số dư tài khoản hiện tại không đủ\nSố dư tài khoản hiện tại: " + soDuTaiKhoan);
        }
    }
}
