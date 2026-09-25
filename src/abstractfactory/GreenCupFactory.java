package abstractfactory;

public class GreenCupFactory implements ServingSetFactory {
    @Override
    public Cup createCup() {
        return new GreenCup();
    }

    @Override
    public Lid createLid() {
        return new GreenLid();
    }

    @Override
    public Receipt createReceipt() {
        return new GreenReceipt();
    }
}
