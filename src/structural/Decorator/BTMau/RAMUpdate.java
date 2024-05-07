package structural.Decorator.BTMau;

public class RAMUpdate extends PCDecorator{
    String addedRam;
    int vAddedRam;

    public RAMUpdate(Computer computer, String addedRam, int vAddedRam) {
        super(computer);
        this.addedRam = addedRam;
        this.vAddedRam = vAddedRam;
    }

    @Override
    String build() {
        return computer.build() + "\n" + addedRam;
    }

    @Override
    int value() {
        return computer.value() + vAddedRam;
    }
}
