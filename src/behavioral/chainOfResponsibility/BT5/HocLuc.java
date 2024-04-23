package behavioral.chainOfResponsibility.BT5;

public abstract class HocLuc {
    float diemCaoNhat;
    String tenHocLuc;
    HocLuc hocLucCaoHon;

    public HocLuc(float diemCaoNhat, String tenHocLuc) {
        this.diemCaoNhat = diemCaoNhat;
        this.tenHocLuc = tenHocLuc;
    }

    public abstract HocLuc hocLucCaoHon(HocLuc hocLucCaoHon);
    public abstract String kiemTraHocLuc(float diem);
}
