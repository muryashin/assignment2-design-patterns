package factorymethod;

public class Latte implements Drink {
    @Override
    public void prepare() {
        System.out.println("Preparing latte: coffee and steamed milk.");
    }
}
