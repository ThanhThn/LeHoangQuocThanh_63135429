package structural.Beverage;

public class Whip extends CondimentDecorator{
    public Whip(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public int cost() {
        return 18 + beverage.cost();
    }
}
