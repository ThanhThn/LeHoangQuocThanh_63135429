package creational.singleton.BT6;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class DataAccessUpgrade {
    private static Dictionary<String, DataAccessUpgrade> instance = new Hashtable<>();
    List<SanPham> sanPhams = new ArrayList<SanPham>();
    private DataAccessUpgrade(){}

    public static DataAccessUpgrade getInstance(String tag){
        if(instance.get(tag) == null){
            DataAccessUpgrade dataAccessUpgrade = new DataAccessUpgrade();
            instance.put(tag, dataAccessUpgrade);
        }
        return  instance.get(tag);
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
