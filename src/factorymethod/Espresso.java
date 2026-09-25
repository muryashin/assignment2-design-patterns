package factorymethod;

public class Espresso implements Drink {
    @Override
    public void prepare() {
        System.out.println("Preparing espresso: coffee and hot water.");
    }
}
