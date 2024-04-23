package behavioral.Observer.BT5;

public class MainBT5 {
    public static void main(String[] args) {
        ATM scb = new ATM();
        TaiKhoan TML = new TaiKhoan(673_000, scb);
        TML.duaTheVaoATM();
        scb.rutTien(73_000);
        scb.rutTien(700_000);
        TML.rutTheKhoiATM();
        scb.rutTien(10_000);
    }
}
