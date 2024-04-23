package behavioral.chainOfResponsibility.BT5;

public class HocLucXuatSac extends HocLuc{
    public HocLucXuatSac(float diemCaoNhat, String tenHocLuc) {
        super(diemCaoNhat, tenHocLuc);
    }

    @Override
    public HocLuc hocLucCaoHon(HocLuc hocLucCaoHon) {
        return null;
    }

    @Override
    public String kiemTraHocLuc(float diem) {
        return tenHocLuc;
    }
}
