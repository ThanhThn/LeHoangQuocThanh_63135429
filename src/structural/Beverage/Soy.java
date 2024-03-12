package structural.Beverage;

public class Soy extends CondimentDecorator{
    public Soy(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public int cost() {
        return 3 + beverage.cost();
    }
}
