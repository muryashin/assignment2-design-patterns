package factorymethod;

public abstract class DrinkCreator {
    public abstract Drink createDrink();

    public void serveDrink() {
        Drink drink = createDrink();
        drink.prepare();
        System.out.println("Drink is ready.");
    }
}
