package creational.singleton.BT6;

public class UI_Upgrade {
    String tag;

    public UI_Upgrade(String tag) {
        this.tag = tag;
    }

    public void add(String maSP, String tenSP, int soLuong, int donGia){
        DataAccessUpgrade.getInstance(tag).ADD(new SanPham(maSP, tenSP, soLuong, donGia));
    }
    public void display(){
        System.out.println(DataAccessUpgrade.getInstance(tag).toString());
    }
}
