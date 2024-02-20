package behavioral.strategy.BT2;

public class MainBT2 {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();
        qlsv.them(new SinhVien("Chí", "1/2/1999", 5.5f));
        qlsv.them(new SinhVien("Phụng", "4/2/1999", 7.54f));
        qlsv.them(new SinhVien("Nam", "2/2/1999", 6.0f));
        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep2();
        qlsv.inDS();
    }
}
