package BT_Java.BT5;

import behavioral.strategy.BT2.SinhVien;

public class LopHoc {
    QLDS qlds = new QLDS();
    public int themSinhVien(HocSinh s){
        if(qlds.them(s) == 1){
            return 1;
        }
        return 0;
    }
    public int themGVGD(GiaoVien gv){
        if(qlds.them(gv) == 1){
            return 1;
        }
        return 0;
    }
}
