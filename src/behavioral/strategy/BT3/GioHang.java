package behavioral.strategy.BT3;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    List<MatHang> matHangs = new ArrayList<MatHang>();
    IGiamThanhToan giamThanhToan;

    public void setGiamThanhToan(IGiamThanhToan giamThanhToan) {
        this.giamThanhToan = giamThanhToan;
    }

    public void thanhToan(){
        
    }
}
