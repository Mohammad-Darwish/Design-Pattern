package creational.factories.factory;

public class Demo {
    public static void main(String[] args) {
        Point point = Point.Factory.newPolarPoint(20, 30);
    }
}
