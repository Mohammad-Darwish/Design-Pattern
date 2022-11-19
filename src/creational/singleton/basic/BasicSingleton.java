package creational.singleton.basic;

import java.io.Serializable;

public class BasicSingleton implements Serializable {
    private BasicSingleton() {
    }

    private static final BasicSingleton INSTANCE = new BasicSingleton();

    public static BasicSingleton getINSTANCE() {
        return INSTANCE;
    }

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // the fix of serialization problem, without it serialize and deserialize create new objects
    protected Object readResolve() {
        return INSTANCE;
    }
}
