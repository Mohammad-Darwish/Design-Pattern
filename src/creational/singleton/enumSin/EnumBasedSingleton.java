package creational.singleton.enumSin;

/**
 * enum by default is serializable and solving thread safe problem, but it does not inherit and
 * some properties might not serializable
 **/
public enum EnumBasedSingleton {
    INSTANCE;

    EnumBasedSingleton() {
        value = 42;
    }

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
