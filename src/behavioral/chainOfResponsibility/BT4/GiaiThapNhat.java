package behavioral.chainOfResponsibility.BT4;

import java.util.ArrayList;
import java.util.List;

public class GiaiThapNhat extends GiaiThuong{

    public GiaiThapNhat(String[] boSoTrungThuong, String tenGiai) {
        super(boSoTrungThuong, tenGiai);
    }

    @Override
    public GiaiThuong giaiThapHon(GiaiThuong giaiThapHon) {
        return null;
    }

    @Override
    public String doVeSo(String veSo) {
        for(String soTrungThuong:boSoTrungThuong){
            if(veSo.endsWith(soTrungThuong)){
                return tenGiai;
            }
        }
        return "Không trúng số";
    }
}
