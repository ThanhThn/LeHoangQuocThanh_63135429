package structural.Decorator.BTMau;


public class ConcretePC extends Computer {
    public ConcretePC(int vMainboard, String screen, String storage, String ram, String mainboard, String cpu, int vScreen, int vStorage, int vRAM, int vCPU) {
        super(vMainboard, screen, storage, ram, mainboard, cpu, vScreen, vStorage, vRAM, vCPU);
    }

    @Override
    String build() {
        StringBuilder builder = new StringBuilder();
        builder.append(getMainboard()); // Sử dụng getter
        builder.append("\n");
        builder.append(getCpu()); // Sử dụng getter
        builder.append("\n");
        builder.append(getRam()); // Sử dụng getter
        builder.append("\n");
        builder.append(getStorage()); // Sử dụng getter
        builder.append("\n");
        builder.append(getScreen()); // Sử dụng getter
        return builder.toString();
    }

    @Override
    int value() {
        return getvMainboard() + getvCPU() + getvRAM() + getvStorage() + getvScreen(); // Sử dụng getter
    }
}
