package creational.factories.abstractF;

public class Demo {
    public static void main(String[] args) throws Exception {
        HotDrinkMachine machine = new HotDrinkMachine();
        HotDrink hotDrink = machine.makeDrink();
        hotDrink.consume();
    }
}
