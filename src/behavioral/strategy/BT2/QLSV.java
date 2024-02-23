package behavioral.strategy.BT2;

import java.util.ArrayList;
import java.util.List;

public class QLSV {
    ISoSanh soSanh;
    List<SinhVien> sinhViens = new ArrayList<SinhVien>();

    public void them(SinhVien sv){
        sinhViens.add(sv);
    }

    public void inDS(){
        for(SinhVien sv: sinhViens){
            System.out.println(sv.toString());
        }
    }
    public void sapXep(){

        if(soSanh != null) sinhViens.sort((o1, o2) -> soSanh.soSanh(o1, o2));
    }
    public void sapXep2(){
        for(int i  = 0 ; i < sinhViens.size() - 1; i++){
            for(int j = i + 1; j < sinhViens.size(); j++){
                if(soSanh.soSanh(sinhViens.get(i),sinhViens.get(j)) == 1){
                    SinhVien s  = sinhViens.get(i);
                    sinhViens.set(i,sinhViens.get(j));
                    sinhViens.set(j, s);
                }
            }
        }
    }

    public void setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }
}
