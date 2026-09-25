package abstractfactory;

public class GreenLid implements Lid {
    @Override
    public void show() {
        System.out.println("GreenCup lid: compostable fiber lid.");
    }
}
