package structural.Decorator.BTMau;

public abstract class PCDecorator extends Computer{
    Computer computer;
    public PCDecorator(Computer computer) {
        super(computer.vMainboard, computer.screen, computer.storage, computer.ram, computer.mainboard, computer.cpu, computer.vScreen, computer.vStorage, computer.vRAM, computer.vCPU);
        this.computer = computer;
    }

}
