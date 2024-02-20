package BT_Java.BT4;


import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {
    List<ChuyenXe> chuyenXes =  new ArrayList<>();

    public boolean Them(ChuyenXe cx){
        for (ChuyenXe c:chuyenXes)
            if(c.maSoChuyen.equals(cx.maSoChuyen))
                return false;

        chuyenXes.add(cx);
        return true;
    }
    public void InDSChuyenXe(){
        for(ChuyenXe c: chuyenXes){
            System.out.println(c.toString());
        }
    }

    public int TongDanhThuXeNgoaiThanh(){
        int tong = 0;
        for (ChuyenXe c: chuyenXes){
            if(c instanceof  ChuyenXeNgoaiThanh){
                tong +=  c.getDoanhThu();
            }
        }
        return tong;
    }
    public int TongDanhThuXeNoiThanh(){
        int tong = 0;
        for (ChuyenXe c: chuyenXes){
            if(c instanceof  ChuyenXeNoiThanh){
                tong +=  c.getDoanhThu();
            }
        }
        return tong;
    }
}
