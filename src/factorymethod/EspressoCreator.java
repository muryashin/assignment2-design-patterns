package factorymethod;

public class EspressoCreator extends DrinkCreator {
    @Override
    public Drink createDrink() {
        return new Espresso();
    }
}
