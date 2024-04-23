package behavioral.chainOfResponsibility.BT4;

import java.util.ArrayList;
import java.util.List;

public class GiaiBinhThuong extends GiaiThuong{
    public GiaiBinhThuong(String[] boSoTrungThuong, String tenGiai) {
        super(boSoTrungThuong, tenGiai);
    }

    @Override
    public GiaiThuong giaiThapHon(GiaiThuong giaiThapHon) {
        this.giaiThapHon = giaiThapHon;
        return giaiThapHon;
    }

    @Override
    public String doVeSo(String veSo) {
        for (String soTrungThuong : boSoTrungThuong) {
            if(veSo.endsWith(soTrungThuong)){
                return tenGiai;
            }
        }
        return giaiThapHon.doVeSo(veSo);
    }
}
