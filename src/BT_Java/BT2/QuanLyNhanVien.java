package BT_Java.BT2;

import BT_Java.BT1.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVien implements IQuanLy{
    List<NhanVien> list = new ArrayList<>();
    @Override
    public void them(NhanVien nv) {
        list.add(nv);
    }

    @Override
    public void inDS() {
        for (NhanVien nv:list) {
            System.out.println(nv.toString());
        }
    }
}
