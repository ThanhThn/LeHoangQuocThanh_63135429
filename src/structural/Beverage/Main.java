package structural.Beverage;

public class Main {
    public static void main(String[] args) {
        Beverage EspressoWithMilk = new Espresso("Cà phê Espresso");
        EspressoWithMilk = new Milk("có sữa", EspressoWithMilk);
        Beverage MilkWhipCoffe = new DarkRoast("Cà phê đen");
        MilkWhipCoffe = new Milk("có sữa", MilkWhipCoffe);
        MilkWhipCoffe = new Whip("có kem trứng", MilkWhipCoffe);
        System.out.println(EspressoWithMilk.getDescription());
        System.out.println("Giá: " + EspressoWithMilk.cost());
        System.out.println(MilkWhipCoffe.getDescription());
        System.out.println("Giá: " + MilkWhipCoffe.cost());

    }
}
