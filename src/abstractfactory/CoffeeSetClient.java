package abstractfactory;

public class CoffeeSetClient {
    private final Cup cup;
    private final Lid lid;
    private final Receipt receipt;

    public CoffeeSetClient(ServingSetFactory factory) {
        cup = factory.createCup();
        lid = factory.createLid();
        receipt = factory.createReceipt();
    }

    public void showSet() {
        cup.show();
        lid.show();
        receipt.print();
    }
}
