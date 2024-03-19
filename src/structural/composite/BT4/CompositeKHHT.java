package structural.composite.BT4;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class CompositeKHHT extends KHHT{
    List<KHHT> list;

    public CompositeKHHT(String ten) {
        super(ten);
        this.list = new ArrayList<>();
    }

    @Override
    public void Add(KHHT k) {
        list.add(k);
    }

    @Override
    public void Remove(KHHT k) {
        list.remove(k);
    }

    @Override
    public int HocPhi() {
        int hocPhi = 0;
        for(KHHT k: list){
            hocPhi += k.HocPhi();
        }
        return hocPhi;
    }

    @Override
    public int TinChi() {
        int tinChi = 0;
        for(KHHT k: list){
            tinChi += k.TinChi();
        }
        return tinChi;
    }

    @Override
    public String ThongTin() {
        StringBuilder builder = new StringBuilder();
        builder.append(getStringTab()).append(ten).append("\t Số tín chỉ: ").append(TinChi()).append("\t Tồng học phí: ").append(HocPhi()).append("\n");
        for (KHHT k: list){
            k.setStringTab(getStringTab() + "\t");
            builder.append(k.ThongTin());
        }
        return builder.toString();
    }
}
