package abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        String style = args.length > 0 ? args[0] : "urban";
        ServingSetFactory factory = chooseFactory(style);
        CoffeeSetClient client = new CoffeeSetClient(factory);
        client.showSet();
    }

    private static ServingSetFactory chooseFactory(String style) {
        if (style.equalsIgnoreCase("green")) {
            return new GreenCupFactory();
        }
        return new UrbanBeanFactory();
    }
}
