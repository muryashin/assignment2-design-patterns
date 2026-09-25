package factorymethod;

public class HotChocolate implements Drink {
    @Override
    public void prepare() {
        System.out.println("Preparing hot chocolate: cocoa and hot milk.");
    }
}
