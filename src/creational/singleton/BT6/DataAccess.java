package creational.singleton.BT6;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private static DataAccess dataAccess;
    List<SanPham> sanPhams = new ArrayList<SanPham>();
    private DataAccess(){}

    public static DataAccess getInstance(){
        if( dataAccess == null){
            dataAccess = new DataAccess();
        }
        return  dataAccess;
    }
    public void ADD(SanPham sanPham){
        for (SanPham s: sanPhams){
            if(s.getMaSanPham().equals(sanPham.maSanPham)) return;
        }
        sanPhams.add(sanPham);
    }
    public void DELETE(String maSP){
        for (SanPham s: sanPhams){
            if(s.getMaSanPham().equals(maSP)){
                sanPhams.remove(s);
                return;
            }
        }
    }
    public void UPDATE(SanPham sanPham){
        for (var i = 0; i < sanPhams.size(); i++){
            if(sanPhams.get(i).getMaSanPham().equals(sanPham.maSanPham)){
                sanPhams.set(i, sanPham);
                return;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (SanPham s: sanPhams){
            builder.append(s).append("\n");
        }
        return builder.toString();
    }
}
