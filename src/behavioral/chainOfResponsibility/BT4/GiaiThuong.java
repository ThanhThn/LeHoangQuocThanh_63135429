package behavioral.chainOfResponsibility.BT4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class GiaiThuong {
    List<String> boSoTrungThuong;
    String tenGiai;
    GiaiThuong giaiThapHon;

    public GiaiThuong(String[] boSoTrungThuong, String tenGiai) {
        this.boSoTrungThuong = new ArrayList<>(Arrays.asList(boSoTrungThuong));
        this.tenGiai = tenGiai;
    }

    public abstract GiaiThuong giaiThapHon(GiaiThuong giaiThapHon);
    public abstract String doVeSo(String veSo);
}
