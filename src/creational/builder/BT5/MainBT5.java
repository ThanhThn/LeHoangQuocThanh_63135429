package creational.builder.BT5;

public class MainBT5 {
    public static void main(String[] args) {
        Book book = new Book.Builder().addTuaDe("Chỉ yêu em").addTacGia("Tom").addChuong("Chương 1: Bắt đầu").addChuong("Chương 2: Kết thúc").addSoTrang(10).builder();
        System.out.println(book);
    }
}
