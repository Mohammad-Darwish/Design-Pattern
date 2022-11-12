package factories.abstractF;

public class TeaFactory implements HotDrinkFactory {
    @Override
    public HotDrink prepare(int amount) {
        System.out.println(
            "Put the tea bag, boil water, pour "
                + amount + "ml, add lemon, enjoy!"
        );
        return new Tea();
    }
}
