package structural.Decorator.BT1;

public class MainBT1 {
    public static void main(String[] args) {
        BieuThuc bieuThuc = new BieuThucDonGian(3);
        bieuThuc = new Cong(bieuThuc, 6);
        bieuThuc = new Cong(bieuThuc, 9);
        bieuThuc = new Tru(bieuThuc, 4);
        bieuThuc = new Cong(bieuThuc, 10);
        bieuThuc = new Nhan(bieuThuc, 10);
        bieuThuc = new Chia(bieuThuc, 8);
        bieuThuc = new Tru(bieuThuc, 34);
        bieuThuc = new TriTuyetDoi(bieuThuc);
        System.out.println("Biểu thức: " + bieuThuc.bieuThuc());
        System.out.println("Giá trị: " + bieuThuc.giaTri());
    }
}
