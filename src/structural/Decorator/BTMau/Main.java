package structural.Decorator.BTMau;

public class Main {
    public static void main(String[] args) {
        Computer computer = new ConcretePC(12000,"LG 14in", "512GB", "6GB SAMSUNG", "MSI MPG Z790 EDGE TI MAX WIFI DDR5", "i5 11400H", 20_000, 3_000, 6_000, 7_000);
        System.out.println("LAN 1");
        System.out.println("LIST DEVICE: \n" + computer.build() + "\nVALUE: " + computer.value() + "\n");
        computer = new RAMUpdate(computer, "8GB SAMSUNG", 4_000);
        System.out.println("LAN 2");
        System.out.println("LIST DEVICE: \n" + computer.build() + "\nVALUE: " + computer.value() + "\n");
        computer = new CPUReplace(computer, "i7 123200H", 21_000);
        System.out.println("LAN 3");
        System.out.println("LIST DEVICE: \n" + computer.build() + "\nVALUE: " + computer.value() + "\n");
    }
}
