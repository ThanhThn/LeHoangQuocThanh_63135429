package behavioral.strategy.BT1;

public class MainBT1 {
    public static void main(String[] args) {
        Context c = new Context();
        c.setTinh(new Cong());
        System.out.println(c.tinh(4,5));
    }
}
