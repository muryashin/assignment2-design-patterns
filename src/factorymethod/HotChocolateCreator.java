package factorymethod;

public class HotChocolateCreator extends DrinkCreator {
    @Override
    public Drink createDrink() {
        return new HotChocolate();
    }
}
