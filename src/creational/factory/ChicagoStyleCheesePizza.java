package creational.factory;

public class ChicagoStyleCheesePizza extends Pizza {
    @Override
    void prepare() {
        builder.append("Chuẩn bị bột và cheese\n");
    }

    @Override
    void bake() {
        builder.append("Rắt cheese lên lớp trên cùng của bánh\n");
    }

    @Override
    void cut() {
        builder.append("Cắt bánh thành 10 phần điều nhau\n");
    }

    @Override
    void box() {
        builder.append("Đóng hộp và dán logo thương hiệu\n");
    }
}
