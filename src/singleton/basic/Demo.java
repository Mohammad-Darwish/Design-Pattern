package singleton.basic;

public class Demo {
    public static void main(String[] args) {
        BasicSingleton singleton = BasicSingleton.getINSTANCE();
        singleton.setValue(11);
        System.out.println(singleton);
    }
}
