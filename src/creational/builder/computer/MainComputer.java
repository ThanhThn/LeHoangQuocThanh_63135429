package creational.builder.computer;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder().addCPU("Intel i5").addRAM("8GB").addStorage("1TB MVMe").addScreen("16 inches LG").build();
        System.out.println(computer);
    }
}
