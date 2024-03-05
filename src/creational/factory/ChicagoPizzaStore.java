package creational.factory;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(PizzaType type) {
        switch (type){
            case PHO_MAI -> {
                return new ChicagoStyleCheesePizza();
            }
            case NGHEU -> {
                return new ChicagoStyleClamPizza();
            }
        }
        return null;
    }
}
