package creational.singleton.multiton;

import java.util.HashMap;

/**
 * Lazy Initialization
 * Has three instances maximum.
 */
public class Printer {
    private static HashMap<Subsystem, Printer> instances = new HashMap<>();
    private static int instancesCount = 0;

    private Printer() {
        instancesCount++;
        System.out.println("A total of " +
            instancesCount + " instances created so far.");
    }

    public static Printer get(Subsystem sys) {
        if (instances.containsKey(sys)) {
            return instances.get(sys);
        }
        Printer instance = new Printer();
        instances.put(sys, instance);
        return instance;
    }
}
