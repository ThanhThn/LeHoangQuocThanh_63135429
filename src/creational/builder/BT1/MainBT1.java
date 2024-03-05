package creational.builder.BT1;

public class MainBT1 {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.Builder().addHoaDonHeader(new HoaDonHeader("A1", "12/2/2023","Lê Vân A")).addCTHD("Vinamilk", 10, 12000, 0).addCTHD("Kem Tràng Tiền", 120, 10000,0).build();
        System.out.println(hoaDon);
    }
}
