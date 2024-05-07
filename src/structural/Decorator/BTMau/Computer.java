package structural.Decorator.BTMau;

public abstract class Computer {
    int vMainboard, vCPU, vRAM, vStorage, vScreen;
    String mainboard, cpu, ram, storage, screen;

    public Computer(int vMainboard, String screen, String storage, String ram, String mainboard, String cpu, int vScreen, int vStorage, int vRAM, int vCPU) {
        this.vMainboard = vMainboard;
        this.screen = screen;
        this.storage = storage;
        this.ram = ram;
        this.mainboard = mainboard;
        this.cpu = cpu;
        this.vScreen = vScreen;
        this.vStorage = vStorage;
        this.vRAM = vRAM;
        this.vCPU = vCPU;
    }

    public int getvMainboard() {
        return vMainboard;
    }

    public void setvMainboard(int vMainboard) {
        this.vMainboard = vMainboard;
    }

    public int getvRAM() {
        return vRAM;
    }

    public void setvRAM(int vRAM) {
        this.vRAM = vRAM;
    }

    public int getvCPU() {
        return vCPU;
    }

    public void setvCPU(int vCPU) {
        this.vCPU = vCPU;
    }

    public int getvStorage() {
        return vStorage;
    }

    public void setvStorage(int vStorage) {
        this.vStorage = vStorage;
    }

    public int getvScreen() {
        return vScreen;
    }

    public void setvScreen(int vScreen) {
        this.vScreen = vScreen;
    }

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    abstract String build();
    abstract int value();
}
