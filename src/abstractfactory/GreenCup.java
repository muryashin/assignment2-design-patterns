package abstractfactory;

public class GreenCup implements Cup {
    @Override
    public void show() {
        System.out.println("GreenCup cup: recyclable kraft paper cup.");
    }
}
