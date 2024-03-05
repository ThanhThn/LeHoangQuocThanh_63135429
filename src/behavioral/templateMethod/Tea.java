package behavioral.templateMethod;

public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Ủ trà");
    }

    @Override
    void addCondiment() {
        System.out.println("Thêm đường");
    }
}
