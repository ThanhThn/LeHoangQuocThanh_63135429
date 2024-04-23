package behavioral.chainOfResponsibility.BT5;

public class HocLucBinhThuong extends HocLuc{
    public HocLucBinhThuong(float diemCaoNhat, String tenHocLuc) {
        super(diemCaoNhat, tenHocLuc);
    }

    @Override
    public HocLuc hocLucCaoHon(HocLuc hocLucCaoHon) {
        this.hocLucCaoHon = hocLucCaoHon;
        return hocLucCaoHon;
    }

    @Override
    public String kiemTraHocLuc(float diem) {
        if (diem < diemCaoNhat) {
            return tenHocLuc;
        }
        return hocLucCaoHon.kiemTraHocLuc(diem);
    }

}
