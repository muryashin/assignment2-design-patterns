package abstractfactory;

public class UrbanReceipt implements Receipt {
    @Override
    public void print() {
        System.out.println("UrbanBean receipt: simple black-and-white style.");
    }
}
