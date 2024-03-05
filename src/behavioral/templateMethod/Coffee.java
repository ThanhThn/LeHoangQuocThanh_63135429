package behavioral.templateMethod;

public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Thêm bột coffee vào phin và cho thêm nước sôi");
    }

    @Override
    void addCondiment() {
        System.out.println("Thêm sữa ông Thọ vào cốc");
    }
}
