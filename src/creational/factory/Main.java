package creational.factory;

public class Main {
    public static void main(String[] args) {
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza p = chicagoPizzaStore.order(PizzaType.NGHEU);
        System.out.println(p.toString());
    }
}
