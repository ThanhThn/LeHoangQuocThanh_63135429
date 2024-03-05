package creational.singleton.BT6;

public class UI1 {
    public void add(String maSP, String tenSP, int soLuong, int donGia){
        DataAccess.getInstance().ADD(new SanPham(maSP, tenSP, soLuong, donGia));
    }
    public void display(){
        System.out.println(DataAccess.getInstance().toString());
    }
}
