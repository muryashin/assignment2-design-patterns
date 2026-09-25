package factorymethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        DrinkCreator creator = new EspressoCreator();
        creator.serveDrink();

        creator = new LatteCreator();
        creator.serveDrink();

        creator = new HotChocolateCreator();
        creator.serveDrink();
    }
}
