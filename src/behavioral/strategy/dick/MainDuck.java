package behavioral.strategy.dick;

public class MainDuck {
    public static void main(String[] args) {
        Duck duck = new VitQuay();
        duck.setFlyBehavior(new BayTrenLoThan());
        duck.setQuackBehavior(new VitQuayKeu());
        duck.display();
        System.out.println("");
        Duck donald = new VitDonald();
        donald.setQuackBehavior(new VitDonaldKeu());
        donald.setFlyBehavior(new BayTrenLoThan());
        donald.display();
    }
}
