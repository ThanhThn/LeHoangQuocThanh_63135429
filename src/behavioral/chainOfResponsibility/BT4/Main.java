package behavioral.chainOfResponsibility.BT4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GiaiThuong db = new GiaiBinhThuong(new String[]{"615582"}, " Giải Đặc biệt");
        GiaiThuong kk = new GiaiKhuyenKhich(new String[]{"615582"}, "Giải khuyến khích");
        GiaiThuong g1 = new GiaiBinhThuong(new String[]{"08666"}, "Giải nhất");
        GiaiThuong g2 = new GiaiBinhThuong(new String[]{"56741"}, "Giải nhì");
        GiaiThuong g3 = new GiaiBinhThuong(new String[]{"79895", "53015"}, "Giải ba");
        GiaiThuong g4 = new GiaiBinhThuong(new String[]{"49378", "39051", "63788", "42453", "61471", "42185", "72739"}, "Giải tư");
        GiaiThuong g5 = new GiaiBinhThuong(new String[]{"6122"}, "Giải năm");
        GiaiThuong g6 = new GiaiBinhThuong(new String[]{"0503", "5307", "4010"}, "Giải sáu");
        GiaiThuong g7 = new GiaiBinhThuong(new String[]{"145"}, "Giải bảy");
        GiaiThuong g8 = new GiaiThapNhat(new String[]{"145"}, "Giải tám");
        db.giaiThapHon(kk).giaiThapHon(g1).giaiThapHon(g2).giaiThapHon(g3).giaiThapHon(g4).giaiThapHon(g5).giaiThapHon(g6).giaiThapHon(g7).giaiThapHon(g8);
        System.out.printf(db.doVeSo("2615482"));
    }
}
