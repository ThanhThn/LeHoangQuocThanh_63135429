package behavioral.chainOfResponsibility;

public abstract class ChoVayF88 {
    int hanMucVay;
    String ten;
    String chucVu;

    public ChoVayF88(int hanMucVay, String ten, String chucVu) {
        this.hanMucVay = hanMucVay;
        this.ten = ten;
        this.chucVu = chucVu;
    }

    public abstract ChoVayF88 caoCapHon(ChoVayF88 capCao);
    public abstract String xuLyVay(int soTienVay);

}
