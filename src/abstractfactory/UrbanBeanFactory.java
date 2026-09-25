package abstractfactory;

public class UrbanBeanFactory implements ServingSetFactory {
    @Override
    public Cup createCup() {
        return new UrbanCup();
    }

    @Override
    public Lid createLid() {
        return new UrbanLid();
    }

    @Override
    public Receipt createReceipt() {
        return new UrbanReceipt();
    }
}
