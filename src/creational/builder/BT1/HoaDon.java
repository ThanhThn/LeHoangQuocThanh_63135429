package creational.builder.BT1;


import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private List<CTHD> cthds;
    private HoaDonHeader hoaDonHeader;


    @Override
    public String toString() {
        String str = hoaDonHeader.toString() + "\n";
        for (CTHD cthd: cthds){
            str += cthd.toString();
        }
        return str;
    }

    private HoaDon(Builder b){
        this.hoaDonHeader = b.hoaDonHeader;
        this.cthds = b.cthds;

    }
    public static class  Builder{
        private List<CTHD> cthds = new ArrayList<CTHD>();
        private HoaDonHeader hoaDonHeader;

        public Builder addHoaDonHeader(HoaDonHeader hoaDonHeader){
            this.hoaDonHeader = hoaDonHeader;
            return this;
        }
        public Builder addCTHD(String sanPham, int soLuong, int donGia, int chietKhau){
            this.cthds.add(new CTHD(sanPham, soLuong, donGia, chietKhau));
            return this;
        }
        public HoaDon build(){ return new HoaDon(this);}
    }

}
