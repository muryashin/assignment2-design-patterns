package abstractfactory;

public class GreenReceipt implements Receipt {
    @Override
    public void print() {
        System.out.println("GreenCup receipt: eco-style digital receipt.");
    }
}
