package creational.liskov;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.setWidth(5);
        Demo.useIt(square);

    }
}