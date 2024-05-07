package structural.Decorator.BTMau;

public class CPUReplace extends PCDecorator{
    String replacedCPU;
    int vReplacedCPU;

    public CPUReplace(Computer computer, String replacedCPU, int vReplacedCPU) {
        super(computer);
        this.replacedCPU = replacedCPU;
        this.vReplacedCPU = vReplacedCPU;
    }

    @Override
    String build() {
        return computer.build().replace(computer.getCpu(), replacedCPU);
    }

    @Override
    int value() {
        return computer.value() - this.computer.getvCPU() + vReplacedCPU;
    }

    @Override
    public int getvCPU() {
        return vReplacedCPU;
    }

    @Override
    public String getCpu() {
        return replacedCPU;
    }
}
