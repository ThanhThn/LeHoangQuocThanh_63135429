package behavioral.chainOfResponsibility.BT4;

public class GiaiKhuyenKhich extends GiaiThuong{
    public GiaiKhuyenKhich(String[] boSoTrungThuong, String tenGiai) {
        super(boSoTrungThuong, tenGiai);
    }

    @Override
    public GiaiThuong giaiThapHon(GiaiThuong giaiThapHon) {
        this.giaiThapHon = giaiThapHon;
        return giaiThapHon;
    }

    @Override
    public String doVeSo(String veSo) {
        StringBuilder builder = new StringBuilder();
        for (String soTrungThuong : boSoTrungThuong) {
            String sub = veSo.substring(veSo.length() - soTrungThuong.length());
            int count  = 2;
            for (int i = sub.length() - 1; i >= 0; i--) {
                if(!(count == 0)){
                    if(sub.charAt(i) != soTrungThuong.charAt(i)) count --;
                }else break;
            }
            if(!(count == 0)){
                builder.append(tenGiai).append('\n');
                break;
            }
        }
        builder.append(giaiThapHon.doVeSo(veSo));
        return builder.toString();
    }
}
