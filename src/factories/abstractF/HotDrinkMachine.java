package factories.abstractF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;


public class HotDrinkMachine {
    public enum AvailableDrink {
        COFFEE, TEA
    }

    private Map<AvailableDrink, HotDrinkFactory> factories =
        new LinkedHashMap<>();

    public HotDrinkMachine() throws Exception {
        for (AvailableDrink drink : AvailableDrink.values()) {
            String s = drink.toString();
            String factoryName = "" + Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
            Class<?> factory = Class.forName("factories.abstractF." + factoryName + "Factory");
            factories.put(drink, (HotDrinkFactory) factory.getDeclaredConstructor().newInstance());
        }
    }

    public HotDrink makeDrink() throws Exception {
        System.out.println("Available drinks:");
        displayOptions();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return insertOrder(reader);
    }

    private void displayOptions() {
        int index = 0;
        for (Map.Entry<AvailableDrink, HotDrinkFactory> factory : factories.entrySet()) {
            System.out.println("" + index + ": " + factory.getKey());
            index++;
        }
    }

    private HotDrink insertOrder(BufferedReader reader) throws IOException {
        while (true) {
            String s;
            int i, amount;
            if ((s = reader.readLine()) != null
                && (i = Integer.parseInt(s)) >= 0
                && i < factories.size()) {
                System.out.println("Specify amount: ");
                s = reader.readLine();
                if (s != null && (amount = Integer.parseInt(s)) > 0) {
                    return (new ArrayList<>(factories.values())).get(i).prepare(amount);
                }
            }
            System.out.println("Incorrect input, try again.");
        }
    }
}
